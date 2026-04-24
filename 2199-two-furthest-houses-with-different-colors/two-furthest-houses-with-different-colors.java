class Solution {
    public int maxDistance(int[] nums) {
        int n = nums.length;
        int maxdist = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[0]) {
                maxdist = Math.max(maxdist, i);
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] != nums[n - 1]) {
                maxdist = Math.max(maxdist, (n - 1) - i);
            }
        }

        return maxdist;
    }
}