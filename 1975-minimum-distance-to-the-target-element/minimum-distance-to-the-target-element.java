// class Solution {
//     public int getMinDistance(int[] nums, int target, int start) {
//         int ans=Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==target){

//                 ans=Math.min(ans,Math.abs(i-start));
               
//             }
//         }
//         return ans;
        
//     }
// }
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                int distance = Math.abs(i - start);
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }

        return minDistance;
    }
}