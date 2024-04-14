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

        for(char c : stringArr) {
            if(c == ')' && stack.isEmpty()) {
                answer = false;
            } else if ( c == ')' && !stack.isEmpty()){
                stack.pop();
            } else if (c == '(') {
                stack.push(c);
            }

        }
        answer = stack.isEmpty();
        System.out.println(answer);
        return answer;
    }

}
