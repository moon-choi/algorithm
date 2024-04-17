class Solution {
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
        }
        System.out.println(answer);
        return answer;
    }
}