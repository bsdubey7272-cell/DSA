class Solution {

    public String longestPalindrome(String s) {

        int start = 0, maxLen = 1;

        for(int i = 0; i < s.length(); i++) {

            for(int j = i; j < s.length(); j++) {

                if(palindrome(s, i, j) && j - i + 1 > maxLen) {
                    start = i;
                    maxLen = j - i + 1;
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

    public boolean palindrome(String s, int i, int j) {

        while(i < j) {

            if(s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
}