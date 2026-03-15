class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        int low=0;
        int high=result.length()-1;
        while(low<high){
            if(result.charAt(low)!=result.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
        
    }
}