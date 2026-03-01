class Solution {
    public int minPartitions(String n) {
        char[] digits = n.toCharArray();
        int count = 0;

        while (true) {
            boolean allZero = true;

            for (int i = 0; i < digits.length; i++) {
                if (digits[i] > '0') {
                    digits[i]--;   // subtract 1 (like adding deci-binary)
                    allZero = false;
                }
            }

            if (allZero) break;
            count++;
        }

        return count;
    }
}