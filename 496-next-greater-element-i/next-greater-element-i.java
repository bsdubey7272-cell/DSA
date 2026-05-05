class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            boolean present=false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    present=true;
                }
                if(present&&nums2[j]>nums1[i]){
                    ans[i]=nums2[j];
                    break;

                }
            }
            for(int k=0;k<ans.length;k++){
                if(ans[i]==0){
                    ans[i]=-1;
                }
            }
        }
        return ans;
    }
}