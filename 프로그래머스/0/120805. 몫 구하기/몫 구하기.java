class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        int modulo;
        
        modulo = num1 % num2;
        answer = (num1 - modulo) / num2;
        return answer;
    }
}