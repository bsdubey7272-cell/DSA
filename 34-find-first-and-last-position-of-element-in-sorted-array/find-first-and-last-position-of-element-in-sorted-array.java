class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,target),last(nums,target)};
        
    }
    public int first(int nums[],int target){
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans=i;
                break;
            }
        }
        return ans;
    }
    public int last(int nums[],int target){
        int ans=-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                ans=i;
                break;
            }

        }
        return ans;
    }
}