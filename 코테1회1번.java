import java.util.ArrayList;
import java.util.List;

public class 코테1회1번 {

    public static void main(String[] args) {
        solution("111100100011");
    }

    public static String solution(String src) {
        String answer = "";

        List<Integer> list = new ArrayList<>();
        String letters = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] srcArr = src.toCharArray();
        int count = 1;
        answer += srcArr[0];

        for (int i = 1; i < srcArr.length; i++) {
            if(srcArr[i] != srcArr[i - 1]) {
                list.add(count);
                count = 1;

            } else {
                count++;
            }
        }
        list.add(count);

        list.toArray(new Integer[0]);
        for(Integer num : list) {
            answer += letters.charAt(num);

        }
        System.out.println(answer);
        return answer;
    }
}
