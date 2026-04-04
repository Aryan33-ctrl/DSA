import java.util.*;

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(') {
                
                if (!stack.isEmpty()) {
                    result.append(c);
                }
                stack.push(c);
            } 
            else {
              
                stack.pop();

                
                if (!stack.isEmpty()) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}