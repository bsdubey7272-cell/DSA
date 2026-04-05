class Solution {
    public boolean judgeCircle(String s) {
        int moveU=0;
        int moveD=0;
        int movesL=0;
        int movesR=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                movesL++;
            }else if(s.charAt(i)=='R'){
                movesR++;
            }else if(s.charAt(i)=='U'){
                moveU++;
            }else{
                moveD++;
            }
            

        }
        if(moveU==moveD&&movesL==movesR){
                return true;
            }
        return false;

        
    }
}