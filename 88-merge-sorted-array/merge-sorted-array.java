class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int answer[]=new int[m+n];
        for(int i=0;i<m;i++){
            answer[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            answer[i+m]=nums2[i];
        }
        Arrays.sort(answer);
        for(int i=0;i<answer.length;i++){
            nums1[i]=answer[i];
        }
        
    }
}