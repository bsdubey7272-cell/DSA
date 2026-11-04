class Solution {
    public int minMoves2(int[] nums) {
        int cnt = 0;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int median = nums[(left + right) / 2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > median) {
                cnt += nums[i] - median;
            } else {
                cnt += median - nums[i];
            }
        }

        return cnt;
    }
}