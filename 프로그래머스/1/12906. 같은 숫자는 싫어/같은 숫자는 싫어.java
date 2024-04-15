import java.util.*;

public class Solution {
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

        return list.toArray(list.toArray(new Integer[0]));
    }
}