class Solution {
    public int hammingWeight(int n) {
        int cnt=0;
        String ans=Integer.toBinaryString(n);
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)=='1'){
                cnt++;
            }
        }
        return cnt;
        
    }
}