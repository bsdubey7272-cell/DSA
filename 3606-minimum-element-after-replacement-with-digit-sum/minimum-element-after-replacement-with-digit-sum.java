class Solution {
    public int minElement(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num = num / 10;
            }

            ans[i] = sum;
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] < min) {
                min = ans[i];
            }
        }

        return min;
    }
}