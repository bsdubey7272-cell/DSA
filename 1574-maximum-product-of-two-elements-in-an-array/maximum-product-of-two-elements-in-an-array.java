class Solution {
    public int maxProduct(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=i+1;j<n;j++){
                product=(nums[i]-1)*(nums[j]-1);
                maxi=Math.max(maxi,product);

            }
        }
        return maxi;
        
    }
}