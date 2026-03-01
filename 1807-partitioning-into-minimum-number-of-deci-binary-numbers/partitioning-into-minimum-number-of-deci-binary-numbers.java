class Solution {
    public int minPartitions(String n) {
        int cnt = 0;

        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';

            if (digit > cnt) {
                cnt = digit;   
            }
        }

        return cnt;
    }
}