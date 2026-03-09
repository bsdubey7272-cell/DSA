class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int maxsum=0;
        while(left<right){
            int sum=nums[left]+nums[right];
            maxsum=Math.max(maxsum,sum);
            left++;
            right--;
        }
        return maxsum;
        
    }
}