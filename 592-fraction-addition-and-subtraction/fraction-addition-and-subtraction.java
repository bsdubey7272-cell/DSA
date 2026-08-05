class Solution {
    public String fractionAddition(String exp) {
        int nume = 0;
        int deno = 1;

        int i = 0;
        int n = exp.length();

        while (i < n) {

            int sign = 1;
            if (exp.charAt(i) == '+' || exp.charAt(i) == '-') {
                sign = (exp.charAt(i) == '-') ? -1 : 1;
                i++;
            }

            int crrnum = 0;
            while (i < n && Character.isDigit(exp.charAt(i))) {
                crrnum = crrnum * 10 + (exp.charAt(i) - '0');
                i++;
            }

            crrnum *= sign;

            i++;//skip '/'

            int crrden = 0;
            while (i < n && Character.isDigit(exp.charAt(i))) {
                crrden = crrden * 10 + (exp.charAt(i) - '0');
                i++;
            }
            nume = nume * crrden + crrnum * deno;
            deno = deno * crrden;
            int g = gcd(Math.abs(nume), deno);
            nume /= g;
            deno /= g;
        }

        return nume + "/" + deno;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}