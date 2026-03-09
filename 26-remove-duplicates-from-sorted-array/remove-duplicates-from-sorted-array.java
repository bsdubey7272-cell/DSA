class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> ans=new LinkedHashSet<>();
        for(int num:nums){
            ans.add(num);
        }
        int i = 0;
        for(int num : ans){
            nums[i++] = num;
        }

        return ans.size();
        
    }
}