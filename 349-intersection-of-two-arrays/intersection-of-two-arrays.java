class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       // int ans[]=new int[Math.min(nums1.length,nums2.length)];
       HashSet<Integer> ans=new HashSet<>();
        int i=0;
        int j=0;
       // int k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums2[j]<nums1[i]){
                j++;
            }else {
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        int result[]=new int[ans.size()];
        int k=0;
        for(int num:ans){
            result[k++]=num;
        }
        return result;
    }
}