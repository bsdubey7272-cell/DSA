class Solution {
    public String largestOddNumber(String s) {
      int i=0;
      while(i<s.length()&& s.charAt(i)=='0'){
        i++;
      }
      s=s.substring(i);
      for(int j=s.length()-1;j>=0;j--){
        if((s.charAt(j)-'0')%2 !=0){
            return s.substring(0,j+1);
        }
      }
      return "";
        
    }
}