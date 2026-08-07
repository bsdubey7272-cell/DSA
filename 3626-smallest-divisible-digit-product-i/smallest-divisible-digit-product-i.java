class Solution {
    public int smallestNumber(int n, int t) {
        for (int ans = n; ; ans++) {
            int temp = ans;
            int product = 1;

            while (temp > 0) {
                product *= temp % 10;
                temp /= 10;
            }

            if (product % t == 0) {
                return ans;
            }
        }
    }
}