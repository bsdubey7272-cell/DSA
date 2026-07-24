class Solution {
public:
    int uniqueXorTriplets(vector<int>& nums) {
        int n = nums.size();
         unordered_set<int> st;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                st.insert(nums[i] ^ nums[j]);
            }
        }
         unordered_set<int> ans;
        for (int pair : st) {
            for (int num : nums) {
                ans.insert(pair ^ num);
            }
        }

        return ans.size();
    }
};