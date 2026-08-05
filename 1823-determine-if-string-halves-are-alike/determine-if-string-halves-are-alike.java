class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        int k = 0;

        while (k < n / 2) {
            ans.append(s.charAt(k));
            k++;
        }

        StringBuilder result = new StringBuilder();
        int j = n / 2;

        while (j < n) {
            result.append(s.charAt(j));
            j++;
        }

        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < ans.length(); i++) {
            char ch = Character.toLowerCase(ans.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                cnt1++;
            }
        }

        for (int i = 0; i < result.length(); i++) {
            char ch = Character.toLowerCase(result.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                cnt2++;
            }
        }

        return cnt1 == cnt2;
    }
}