class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans=new StringBuilder();
        int n=strs.length;
        Arrays.sort(strs);
        String left=strs[0];
        String right=strs[n-1];
        for(int i=0;i<Math.min(left.length(),right.length());i++){
            if(left.charAt(i)!=right.charAt(i)){
                return ans.toString();
            }
            ans.append(left.charAt(i));
        }
        return ans.toString();

    }
}
    
