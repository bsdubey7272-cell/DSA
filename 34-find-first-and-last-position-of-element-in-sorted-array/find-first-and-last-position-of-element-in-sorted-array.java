/*class Solution {
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
*/
class Solution {
    public int[] searchRange(int[] nums, int target) {
    int firstocc=first(nums,target);
    int lastocc=last(nums,target);
    return new int[]{firstocc,lastocc};
    }
    private int first(int nums[],int target){
        int ans=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        
        return ans;
    }
    private int last(int nums[],int target){
         int ans=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        
        return ans;
    }
}