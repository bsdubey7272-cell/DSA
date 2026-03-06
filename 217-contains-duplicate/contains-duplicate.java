class Solution {
    public boolean containsDuplicate(int[] nums) {
    //    int low=0;
    //    int high=nums.length-1;
    //    while(low<high){
    //     if(nums[low]==nums[high]){
    //         return true;
    //     }
    //     low++;
    //     high--;
    //    }
    //    return false;
    Set<Integer> st=new HashSet<>();
    int n=nums.length;
    for(int num:nums){
        st.add(num);
    }
    if(st.size()==n){
        return false;
    }
    return true;

    }
}