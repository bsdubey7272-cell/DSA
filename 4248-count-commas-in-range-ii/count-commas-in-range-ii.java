class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0;
        }
       long result=0;
       long lower=1000;
       long comma=1;
       while(lower<=n){
        long upper=lower*1000-1;
        if (upper > n) upper = n;
        long cntnum=upper-lower+1;
        result+=(cntnum*comma);
        lower=lower*1000;
        comma+=1;
       }
       return result;
        
    }
}