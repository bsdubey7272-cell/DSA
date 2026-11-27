
import java.util.*;

class Solution {
    public int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();

        stack.push(-1);

        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                // Store index of opening bracket
                stack.push(i);

            } else {

                // Remove the matching opening bracket or base
                stack.pop();

                if (stack.isEmpty()) {

                    // Update base index
                    stack.push(i);

                } else {

                    // Calculate valid substring length
                    int len = i - stack.peek();

                    maxLen = Math.max(maxLen, len);
                }
            }
        }

        return maxLen;
    }
}
