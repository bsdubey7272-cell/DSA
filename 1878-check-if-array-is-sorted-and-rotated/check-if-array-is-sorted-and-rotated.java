class Solution {
    public boolean check(int[] nums) {
        int countBreakPoints = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            
            if (nums[i] > nums[(i + 1) % n]) {
                countBreakPoints++;
            }
            
            
            if (countBreakPoints > 1) {
                return false;
            }
        }
        
        return true;
    }
}
