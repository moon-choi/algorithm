import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 같은숫자는싫어 {

    public static void main(String[] args) {
        solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        solution(new int[]{4, 4, 4, 3, 3});
    }
    public static Integer[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(arr[0]);

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                queue.offer(arr[i]);
            }
        }

        while(!queue.isEmpty()) {
            list.add(queue.poll());
        }

        return list.toArray(new Integer[0]);
    }
}
