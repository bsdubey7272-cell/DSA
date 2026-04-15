class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n<=0) return false;
        while(n%2==0){
            n=n/2;
        }
        return n==1;
   // String binary=Integer.toBinaryString(n);
   // String b=Integer.toBinaryString(n-1);
//    if(n<=0) return false;
//    if ((n & (n - 1)) == 0) return true;
   // return false;
    }
}