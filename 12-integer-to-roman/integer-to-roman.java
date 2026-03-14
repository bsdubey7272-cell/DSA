import java.util.*;

class Solution {
    public String intToRoman(int num) {

        Map<Integer, String> ans = new LinkedHashMap<>();

        ans.put(1000, "M");
        ans.put(900, "CM");
        ans.put(500, "D");
        ans.put(400, "CD");
        ans.put(100, "C");
        ans.put(90, "XC");
        ans.put(50, "L");
        ans.put(40, "XL");
        ans.put(10, "X");
        ans.put(9, "IX");
        ans.put(5, "V");
        ans.put(4, "IV");
        ans.put(1, "I");

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Integer, String> entry : ans.entrySet()) {
            while (num >= entry.getKey()) {
                num -= entry.getKey();
                result.append(entry.getValue());
            }
        }

        return result.toString();
    }
}