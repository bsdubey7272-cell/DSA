class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum < Math.abs(target) || (totalSum + target) % 2 != 0) {
            return 0;
        }
        int requiredSum = (totalSum + target) / 2;
        int[] dp = new int[requiredSum + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int s = requiredSum; s >= num; s--) {
                dp[s] += dp[s - num];
            }
        }
        return dp[requiredSum];
    }
}
