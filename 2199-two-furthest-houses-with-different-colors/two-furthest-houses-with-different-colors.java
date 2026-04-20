class Solution {
    public int maxDistance(int[] nums) {
        int maxdist=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    maxdist=Math.max(maxdist,Math.abs(i-j));
                }
            }
        }
        return maxdist;
        
    }
}