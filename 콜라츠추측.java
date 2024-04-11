public class 콜라츠추측 {

    //1인 경우
    //count == 500인 경우
    //짝수인 경우
    //홀수인 경우

    public static void main(String[] args) {
        콜라츠추측 sol = new 콜라츠추측();
        sol.solution(6);
        sol.solution(16);
        sol.solution(626331);
    }

    public int solution(long num) {
        int answer = 0;
        int count = 0;

        while (count < 500 && num > 1) {
            if (num % 2 == 0) {
                num /= 2;
                count++;
                if (count >= 500) {
                    answer = -1;
                    break;
                }
            } else {
                num = num * 3 + 1;
                count++;
                if (num == 1) {
                    answer = 0;
                    break;
                }

            }
            answer = count;
        }
        System.out.println(answer);
        return answer;
    }
}
