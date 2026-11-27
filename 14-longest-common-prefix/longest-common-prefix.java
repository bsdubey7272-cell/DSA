
class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Take the first string as reference
        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            // Compare with all other strings
            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length() ||
                    strs[j].charAt(i) != ch) {

                    return first.substring(0, i);
                }
            }
        }

        return first;
    }
}
