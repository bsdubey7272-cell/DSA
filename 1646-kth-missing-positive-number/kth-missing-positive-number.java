class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num = 1;
        int i = 0;

        for (; k > 0; num++) {
            if (i < arr.length && arr[i] == num) {
                i++;
            } else {
                k--;
            }
        }

        return num - 1;
    }
}