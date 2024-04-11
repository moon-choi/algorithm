public class 콜라츠추측 {

    //1인 경우
    //count == 500인 경우
    //짝수인 경우
    //홀수인 경우

    public static void main(String[] args) {
        콜라츠추측 sol = new 콜라츠추측();
        sol.solution(1);
        sol.solution(6);
        sol.solution(16);
        sol.solution(626331);
    }

    //풀이 1.
    public int solution(long num) {

        int answer = 0;

        //1이면 아예 while 문으로 들어가지 않음.
        while (answer < 500 && num > 1) {

            if (num % 2 == 0) { //짝수일 때
                num /= 2;
                answer++; //count가 499번째면 일단 while문 들어오고,
                if (answer >= 500) { //1 올려준 뒤 break.
                    answer = -1;
                    break;
                }

            } else { //홀수일 때
                num = num * 3 + 1;
                answer++;
            }
            answer = answer;
        }
        System.out.println(answer);
        return answer;
    }


    //풀이 2.
    public int solution2(long num) {

        int answer = 0;

        //1이면 아예 while 문으로 들어가지 않음.
        while (answer < 500 && num > 1) {
            answer++; //먼저 올려줌. 그러고 나서 500 이상인지 검사해야함.
            if (answer >= 500) {
                answer = -1;
                break;
            }

            if (num % 2 == 0) { //짝수일 때
                num /= 2;

            } else { //홀수일 때
                num = num * 3 + 1;
            }
        }
//        answer++; //여기서 올리면 안됌. 그러면 500이 리턴될 수 있음.
        System.out.println(answer);
        return answer;
    }
}
