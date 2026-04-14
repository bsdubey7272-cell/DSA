class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int base = 2; base <= n - 2; base++) {
            String num = Integer.toString(n, base);
            
            int low = 0;
            int high = num.length() - 1;

            while (low < high) {
                if (num.charAt(low) != num.charAt(high)) {
                    return false;
                }
                low++;
                high--;
            }
        }
        return true;
    }
}