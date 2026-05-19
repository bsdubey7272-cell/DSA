class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;
        int mini = Integer.MAX_VALUE;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {
                mini = Math.min(mini, nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }
        return mini == Integer.MAX_VALUE ? -1 : mini;
    }
}