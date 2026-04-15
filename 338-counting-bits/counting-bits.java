class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];

       
        for(int i=0;i<=n;i++){
            int cnt=0;
            String num=Integer.toBinaryString(i);
            for(char ch:num.toCharArray()){
                if(ch=='1') cnt++;
            }
            ans[i]=cnt;

        }
        return ans;
    }
}