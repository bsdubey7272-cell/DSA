class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int product = 1;
        int zeroCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                product *= nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                ans[i] = 0;
            } else if (zeroCount == 1) {
                ans[i] = (nums[i] == 0) ? product : 0;
            } else {
                ans[i] = product / nums[i];
            }
        }

        return ans;
    }
}