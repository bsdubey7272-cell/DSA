import java.util.*;

class Solution {

    Boolean[] dp;

    public boolean canJump(int[] nums) {

        dp = new Boolean[nums.length];

        return solve(0, nums);
    }

    public boolean solve(int i, int[] nums) {

        if (i >= nums.length - 1) {
            return true;
        }

        if (nums[i] == 0) {
            return false;
        }

        if (dp[i] != null) {
            return dp[i];
        }

        for (int jump = 1; jump <= nums[i]; jump++) {

            if (solve(i + jump, nums)) {
                dp[i] = true;
                return true;
            }
        }

        dp[i] = false;
        return false;
    }
}