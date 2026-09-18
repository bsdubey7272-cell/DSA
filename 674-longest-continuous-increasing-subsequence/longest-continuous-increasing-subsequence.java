class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int crr=1;
        int maximum=1;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                crr++;
            }
            else{
                crr=1;
            }
            maximum=Math.max(maximum,crr);

        }
        return maximum;

        
    }
}