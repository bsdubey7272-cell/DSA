class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int maximumproduct=nums[n-1]*nums[n-2];
        int minimumproduct=nums[0]*nums[1];
        int difference= maximumproduct-minimumproduct;
        return difference;
}
}