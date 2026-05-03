class Solution {   
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if (n != goal.length()) return false;
        String left = "";
        for (int i = 0; i < n; i++) {
            String right = s.substring(i);
            if ((right + left).equals(goal))
                return true;
            left += s.charAt(i);
        }
        return false;
    }
}
