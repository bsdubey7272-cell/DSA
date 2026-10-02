class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> st = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            st.put(num, st.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : st.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }
}