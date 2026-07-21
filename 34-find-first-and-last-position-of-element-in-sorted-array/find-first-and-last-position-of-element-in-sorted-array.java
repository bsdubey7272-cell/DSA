class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,target),last(nums,target)};
        
    }
    public int first(int nums[],int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid = left+ (right - left) / 2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;

            }else if(nums[mid]<target){
                left=mid+1;
            }else right=mid-1;
        }
        return  ans;
    }
    public int last(int nums[],int target){
        int ans=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;

            }else{
                low=mid+1;
            }

        }
        return ans;
    }
}