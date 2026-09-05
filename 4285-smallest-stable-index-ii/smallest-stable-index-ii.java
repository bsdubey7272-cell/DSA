class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            ans[i]=min;
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
             if(max-ans[i]<=k){
                return i;
            
        }

            
        }
        return -1;
       
        
        
    }
}