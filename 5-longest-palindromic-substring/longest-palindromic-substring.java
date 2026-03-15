class Solution {

    public String longestPalindrome(String s) {

        String result = "";
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++) {

            for(int j = i; j < s.length(); j++) {

                String curr = s.substring(i, j + 1);

                if(isPalindrome(curr)) {

                    if(curr.length() > maxLength) {
                        maxLength = curr.length();
                        result = curr;
                    }

                }

            }
        }

        return result;
    }

    public boolean isPalindrome(String s){

        int low = 0;
        int high = s.length() - 1;

        while(low < high){

            if(s.charAt(low) != s.charAt(high)){
                return false;
            }

            low++;
            high--;

        }

        return true;
    }
}