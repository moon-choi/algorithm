import java.util.Stack;
class Solution {
    public static boolean solution(String s) {
        boolean answer = true;
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
        
        answer = stack.isEmpty() ? true : false;
        // answer = stack.isEmpty();
        return answer;
    }
}