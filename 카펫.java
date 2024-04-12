import java.util.Arrays;

public class 카펫 {

    public static void main(String[] args) {
        solution(10, 2);
        solution(8, 1);
        solution(24, 24);
    }

    //풀이 1. 12.97ms ~ 22.06ms
    private static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        //x = 갈색의 가로
        //y = 갈색의 세로
        //2x + 2(y - 2) = brown
        //2(x + y - 2) = brown

        //x - 2 = 노란색의 가로
        //y - 2 = 노란색의 세로
        //(x - 2) * (y - 2) = yellow

        for (int x = 1; x < 5000; x++) {
            for (int y = 1; y <= x; y++) {
                if ((x - 2) * (y - 2) == yellow && (x + y - 2) * 2 == brown) {
                    answer[0] = Math.max(x, y);
                    answer[1] = Math.min(x, y);
                }
            }
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }

    /*
    //풀이 2. 0.03ms
    public int[] solution(int brown, int yellow) {

        int sum = (brown / 2) + 2;
        int total = brown + yellow;

        int x = 0;
        int y = 0;
        for (y = 3; y <= sum; y++) {
            x = sum - y;
            if (total == x * y && x >= y) {
                break;
            }
        }

        int[] answer = {x, y};

        return answer;
    }
    */


}
