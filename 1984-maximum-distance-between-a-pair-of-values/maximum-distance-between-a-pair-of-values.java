class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int maxdis = 0;

        for (int i = 0; i < nums1.length; i++) {
            int left = i, right = nums2.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums1[i] <= nums2[mid]) {
                    maxdis = Math.max(maxdis, mid - i);
                    left = mid + 1; 
                } else {
                    right = mid - 1;
                }
            }
        }

        return maxdis;
    }
}