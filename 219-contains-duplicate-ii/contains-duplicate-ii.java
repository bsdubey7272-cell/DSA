class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> st = new HashSet<>();
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (j - i > k) {
                st.remove(nums[i]);
                i++;
            }
            if (st.contains(nums[j])) {
                return true;
            }st.add(nums[j]);
        }

        return false;
    }
}