class Solution {
    public boolean isAnagram(String s, String t) {
        int[] lower = new int[26];
        if(s.length() != t.length()){
         return false;
        }
        for(int i = 0; i<s.length();i++){
           lower[s.charAt(i) - 'a'] ++;
        }
        for(int j = 0;j<t.length();j++){
            lower[t.charAt(j) - 'a']--;
        }

        for(int c : lower){
            if(c != 0){
                return false;
            }
        }        
        return true;      
    }
}
