class Solution {
    int dp[][];
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        dp=new int [n+1][n+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
            }
            return solve(nums,0,-1);
    }
    public int solve(int nums[],int i,int p){
        if(i>=nums.length){
            return 0;
        }
        //take
        if(dp[i][p+1]!=-1){
            return dp[i][p+1];
        }
        int take=0;
        if(p==-1||nums[i]>nums[p]){
             take=1+solve(nums,i+1,i);
        }
        
        int skip=solve(nums,i+1,p);
        
        dp[i][p+1]= Math.max(take,skip);
        return dp[i][p+1];
    }
}