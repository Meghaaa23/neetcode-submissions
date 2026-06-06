class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> values= new HashSet(); 
        int n = nums.length;
        for(int i=0;i<=n-1;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k = j+1;k<n;k++){
                    int[] arr = new int[3];
                
                    if(nums[i]+nums[j]+nums[k] == 0){
                        arr[0] = nums[i];
                        arr[1] = nums[j];
                        arr[2] = nums[k];
                        List<Integer> ls = Arrays.asList(arr[0],arr[1],arr[2]); 
                        Collections.sort(ls); 
                        values.add(ls);
                    }
                }
            }  
            
        }
        return new ArrayList<>(values);
        
    }
}
