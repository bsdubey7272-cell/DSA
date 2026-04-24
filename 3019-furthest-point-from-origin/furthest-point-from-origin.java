class Solution {
    public int furthestDistanceFromOrigin(String s) {
        int n=s.length();
        int Lcnt=0;
        int Rcnt=0;
        int _cnt=0;
        for( char c:s.toCharArray()){
            if(c=='L'){
                Lcnt++;
            }else if(c=='R'){
                Rcnt++;
            }else{
                _cnt++;
            }
        }  
        return Math.abs(Lcnt-Rcnt)+_cnt;     
    }
}