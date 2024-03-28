import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class 너비탐색 {

    public static void main(String[] args) {

        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 3, 6));
        graph.put(1, Arrays.asList(0, 3));
        graph.put(2, Arrays.asList(3));
        graph.put(3, Arrays.asList(0, 1, 2, 7));
        graph.put(4, Arrays.asList(5));
        graph.put(5, Arrays.asList(4, 6, 7));
        graph.put(6, Arrays.asList(0, 5));
        graph.put(7, Arrays.asList(3, 5));

        bfs(graph, 0);
    }

    public static void bfs(Map<Integer, List<Integer>> graph, int start) {

        Queue<Integer> queue = new LinkedList<>(); //앞으로 탐색할 노드들을 넣는 큐
        Set<Integer> visited = new HashSet<>(); //방문한 노드들을 넣는 셋
        List<Integer> result = new ArrayList<>(); //탐색 잘 됐는지 확인용

        //처음 노드를 넣어주고 시작
        queue.offer(start);
        visited.add(start);

        while (!queue.isEmpty()) { //큐가 빌 때까지 반복
            int current = queue.poll(); //큐 가장 앞의 노드를 뽑음
            result.add(current);
            for (Integer connected : graph.get(current)) { //현재 노드와 연결된 노드 배열 모두 체크
                if (!visited.contains(connected)) { //첫 방문이면 큐에 추가
                    queue.offer(connected); //큐에 넣어줌
                    visited.add(connected); //방문 리스트에 더해줌
                }
                //첫 방문 아니면 아무것도 안하고 for문에서 다음 node로 넘어감.
            }
        }

        System.out.println("너비탐색순서: " + result); // [0, 1, 3, 6, 2, 7, 5, 4]
    }
}