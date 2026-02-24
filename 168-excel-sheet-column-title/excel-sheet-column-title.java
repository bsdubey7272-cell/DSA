class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result=new StringBuilder();
       while(columnNumber>0){
        columnNumber--;//for adjusting 1 index
        
        int rem=columnNumber%26;//since column is repeating after 26 
        result.append((char)(rem+'A'));
        columnNumber=columnNumber/26;
       } 
       return result.reverse().toString();
    }
}