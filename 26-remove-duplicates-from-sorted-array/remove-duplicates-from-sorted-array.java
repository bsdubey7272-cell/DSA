class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> ans=new LinkedHashSet<>();
        for(int num:nums){
            ans.add(num);
        }
        //int result[]=new int[ans.size()];
        int k=0;
        for(int num:ans){
            nums[k++]=num;
        }
        return k;
        
    }
}