class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> values = new HashMap<>();
        
        for(String str : strs){
            int[] lower = new int[26];
            for(int i=0;i<str.length();i++){
                lower[str.charAt(i) - 'a']++;
            }
            
            // StringBuilder sb = new StringBuilder();
            // for(int count : lower){
            //     sb.append(' ').append(count);
            // }
            String temp = "";
            for (int i = 0; i < lower.length; i++) {
                if (lower[i] >= 1) {
                    for(int j=0;j<lower[i];j++)
                    {
                    temp += (char)(i + 'a');  // 'a' is 97, so i=0 gives 'a', i=1 gives 'b', etc.
                    }
                }
            }
            String key = temp;//sb.toString();
            System.out.println(key);
            if (!values.containsKey(key)) {
                values.put(key, new ArrayList<>());
            }
            values.get(key).add(str);
        }
        return new ArrayList<>(values.values());
    }
}
