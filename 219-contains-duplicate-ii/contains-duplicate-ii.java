class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j] && Math.abs(i-j)<=k){
        //             return true;
        //         }
        //     }
        // }
        // return false;
       Map<Integer,Integer> mp=new HashMap<>();
       for(int i=0;i<n;i++){
        if(mp.containsKey(nums[i])&&i-mp.get(nums[i])<=k){
            return true;
        }
        mp.put(nums[i],i);
       }
       return false;
        
    }
}