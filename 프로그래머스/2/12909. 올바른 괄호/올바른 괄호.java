import java.util.Stack;
class Solution {
    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] stringArr = s.toCharArray();
        for (char c : stringArr) {

            if (c == '(') {
                stack.push(c);
            } else { //')'일 때
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }

        }
        
        return stack.isEmpty();
    }
}