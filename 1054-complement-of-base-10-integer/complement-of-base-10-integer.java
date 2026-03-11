class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
       int cnt=0;
       int result=0;
       while(n>0){
        int rem=n%2;
         result+=Math.pow(2,cnt)*(1-rem);
         cnt++;
        n=n/2;
       }
        return result;
    }
}