//brute force
/*class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }

        return nums.length;
    }
}
*/
//optimal like lower bound
class Solution {
    public int searchInsert(int[] nums, int target) {
      int low=0;
      int high=nums.length-1;
      int ans=nums.length;
      while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]>=target){
            ans= mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
      }
      return ans;
    }
}
