import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 같은숫자는싫어 {

    public static void main(String[] args) {
        solution(new int[]{1, 1, 3, 3, 0, 1, 1});
//        solution(new int[]{4, 4, 4, 3, 3});
    }
    public static int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int num : arr) {
            queue.offer(num);
        }

        int curr = queue.poll();
        list.add(curr);
        while(!queue.isEmpty()) {
            int next = queue.peek();
            if(curr == next) {
                curr = queue.poll();
            } else {
                list.add(next);
                queue.poll();
            }
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        return answer;
    }
}
