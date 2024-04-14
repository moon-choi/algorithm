import java.util.Stack;

public class 올바른괄호 {

    public static void main(String[] args) {

        solution("()()");
        solution("(())()");
        solution(")()(");
        solution("(()(");
    }
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
                    //Q. 왜 여기를 answer = false; 하면 테스트 2번, 6번 통과를 못할까?
                    // 반례: "))" 밑의 stack.isEmpty에서 true가 됌.
                } else {
                    stack.pop();
                }
            }

        }

        answer = stack.isEmpty()? true : false;
        // answer = stack.isEmpty();
        return answer;
    }
}
