class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        int maxFreq = 0;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) continue;
            int freq = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    freq++;
                }
            }
            if (freq > maxFreq) {
                maxFreq = freq;
                ans = nums[i];
            } else if (freq == maxFreq && nums[i] < ans) {
                ans = nums[i];
            }
        }

        return ans;
    }
}