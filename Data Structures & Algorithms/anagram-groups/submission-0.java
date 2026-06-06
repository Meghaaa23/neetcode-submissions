class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> values = new HashMap<>();
        
        for(String str : strs){
            int[] lower = new int[26];
            for(int i=0;i<str.length();i++){
                lower[str.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int count : lower){
                sb.append(' ').append(count);
            }
            String key = sb.toString();

            if (!values.containsKey(key)) {
                values.put(key, new ArrayList<>());
            }
            values.get(key).add(str);
        }
        return new ArrayList<>(values.values());
    }
}
