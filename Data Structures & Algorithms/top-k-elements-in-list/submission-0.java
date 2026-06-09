class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        int n = nums.length;
        int p=0,count=1;
        int[] dup = new int[n];
        int[] list = new int[k];
        int[] values = new int[n];

        for(int i =0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                count++;
            }
            else{
                values[p] = nums[i];
                dup[p] = count;
                p++;

                count =1;
            }

            
        }
        values[p] = nums[n - 1];
        dup[p] = count;
        p++;


        for (int i = 0; i < p - 1; i++) {
            for (int j = i + 1; j < p; j++) {

                if (dup[i] < dup[j]) {

                    int temp = dup[i];
                    dup[i] = dup[j];
                    dup[j] = temp;

                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }
        // Arrays.add(dup);
        // Arrays.sort(dup);
        
        for(int j=0;j<k;j++){
            list[j] = values[j];
        }
        return list;
    }
}
