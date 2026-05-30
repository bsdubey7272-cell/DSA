class Solution {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cnt++;
            } else {
                cnt = 1;
            }
            if (cnt < 3) {
                result.append(s.charAt(i));
            }
        }
    return result.toString();
    }
}