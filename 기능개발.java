import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발 {

    public static void main(String[] args) {
//        solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
    }

    public static Integer[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();
        int[] days = new int[speeds.length];
        List<Integer> list = new ArrayList<>();
        //남은 작업일 수 배열로 만듦.
        for (int i = 0; i < progresses.length; i++) {
            int remainder = (100 - progresses[i]) % speeds[i];
            int day = (100 - progresses[i]) / speeds[i];
//            double day = Math.ceil((100 - progresses[i]) / speeds[i]);
            System.out.println("day: " + day);
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
                queue.poll(); //Q. 왜 여기서 top = queue.poll()이라고 하면 통과 못하지?
                //반례: 만약 5, 10, 1, 1, 9, 1 오면 10보다 작으니까
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
