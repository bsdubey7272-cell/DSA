class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1||num==0) return true;
        for(int i=1;i<=num/i;i++){
            if((long)i*i==num) return true;
        }
        return false;
        
    }
}