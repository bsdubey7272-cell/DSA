class Solution {
    public int majorityElement(int[] nums) {
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     int cnt=0;
        //     for(int j=0;j<n;j++ ){
        //         if(nums[i]==nums[j]){
        //             cnt++;
        //         }

        //     }
        //     if(cnt>n/2) return nums[i];
        // }
        // return -1;
        int n=nums.length;
        HashMap<Integer,Integer> major=new HashMap<>();
        
        for(int i=0;i<n;i++){
            int cnt=major.getOrDefault(nums[i],0)+1;
            major.put(nums[i],cnt);
            if(cnt>n/2) return nums[i];
        }
        
        return -1;
        
    }
}