class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        return (solve(result,0,result.length()-1));
        
    }

    public boolean solve(String s,int low,int high){
        if(low>=high){
            return true;
        }else if(s.charAt(low)!=s.charAt(high)){
            return false;
        }else {
           return solve(s,low+1,high-1);
        }
      

    }
}