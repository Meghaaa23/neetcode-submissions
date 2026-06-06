class Solution {
    public boolean isAnagram(String s, String t) {
        int[] lower = new int[26];
        if(s.length() != t.length()){
         return false;
        }
        for(int i = 0; i<s.length();i++){   //n
           lower[s.charAt(i) - 'a'] ++;
        }
        for(int j = 0;j<t.length();j++){    //n
            lower[t.charAt(j) - 'a']--;
        }

        for(int c : lower){      //26
            if(c != 0){
                return false;
            }
        }        
        return true;      
    }
}
// O(n+n+26) = O(2n+26)  => O(n)
//S(1)