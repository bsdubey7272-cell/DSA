class Solution {
    public int[] searchRange(int[] nums, int target) {
    int firstocc=first(nums,target);
    int lastocc=last(nums,target);
    return new int[]{lastocc,firstocc};
    }
    private int first(int nums[],int target){
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans=i;
            }
        }
        return ans;
    }
    private int last(int nums[],int target){
        int ans=-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                ans=i;
            }
        }
        return ans;
    }
}