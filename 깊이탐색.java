import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class 깊이탐색 {

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

        dfs(graph, 0);
    }

    public static void dfs(Map<Integer, List<Integer>> graph, int start) {

        Stack<Integer> stack = new Stack<>(); //앞으로 탐색할 노드들을 넣는 스택
        Set<Integer> visited = new HashSet<>(); //방문한 노드들을 넣는 셋
        List<Integer> result = new ArrayList<>(); //탐색 잘 됐는지 확인용

        //처음 노드를 넣어주고 시작
        stack.push(start);
        visited.add(start);

        while (!stack.isEmpty()) { //스택이 빌 때까지 반복
            Integer current = stack.pop(); //스택 가장 위의 노드를 뽑음
            result.add(current);

            for (Integer connected : graph.get(current)) {
                if (!visited.contains(connected)) {
                    stack.push(connected);
                    visited.add(connected);
                }
            }
        }

        System.out.println("깊이탐색순서: " + result); // [0, 6, 5, 7, 4, 3, 2, 1] //왜틀림??
        //[0,6,5,7,3,1,2,4]여야 되지 않나? //노정호 강의 보기
    }

}
