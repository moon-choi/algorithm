import java.util.HashMap;
import java.util.Map;

class Solution {
    public static String solution(int a, int b) {
        String answer = "";
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        Map<Integer, Integer> months = new HashMap<>();
        months.put(1, 31);
        months.put(2, 29);
        months.put(3, 31);
        months.put(4, 30);
        months.put(5, 31);
        months.put(6, 30);
        months.put(7, 31);
        months.put(8, 31);
        months.put(9, 30);
        months.put(10, 31);
        months.put(11, 30);
        months.put(12, 31);

        int sum = 0;
        for (int i = 1; i < a; i++) {
            sum += months.get(i); //1월부터 a월 전까지의 누적일 수.
        }

        //b일은 sum + b;
        answer = days[((sum + b) - 1) % 7];

        return answer;
    }
}