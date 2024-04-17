import java.util.*;

class Solution {
public static Integer[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();
        int[] days = new int[speeds.length];
        List<Integer> list = new ArrayList<>();
        //남은 작업일 수 배열로 만듦.
        for (int i = 0; i < progresses.length; i++) {
            int remainder = (100 - progresses[i]) % speeds[i];
            int day = (100 - progresses[i]) / speeds[i];
            days[i] = (remainder == 0) ? day : day + 1;
        }

        //큐에 넣음.
        for (int i = 0; i < days.length; i++) {
            queue.offer(days[i]);
        }
        
        int count = 1;
        int top = queue.poll();
    
        while (!queue.isEmpty()) {
  
            int next = queue.peek();
            if (top >= next) {
                count++;
                queue.poll(); //왜 여기서 top = queue.poll()이라고 하면 통과 못하지?
            } else {
                list.add(count); //여기까지 포함해서 앞의 것 모두 배포 완료했으니 다시 카운트 초기화
                count = 1;
                top = queue.poll();

            }
        }
        list.add(count);

        Integer[] arr = list.toArray(new Integer[0]);
        return arr;
    }
}