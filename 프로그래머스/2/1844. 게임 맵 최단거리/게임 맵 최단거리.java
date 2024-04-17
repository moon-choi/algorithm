import java.util.LinkedList;
import java.util.Queue;

class Solution {
    
    public static boolean isInRange(int x, int y, int rowLength, int colLength, int[][] maps) {
        return (x >= 0 && x < rowLength) && (y >= 0 && y < colLength) && (maps[x][y] == 1);
    }
    
    public static int solution(int[][] maps) {
        int shortestDist = -1;
        int rowLength = maps.length;
        int colLength = maps[0].length;
        int count = 1;
        boolean[][] visited = new boolean[rowLength][colLength];

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; //동, 서, 남, 북
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] curXY = queue.poll();
            int curX = curXY[0];
            int curY = curXY[1];
            int curDist = curXY[2];

            if (curX == rowLength - 1 && curY == colLength - 1) { //끝,끝 이면 도착한 것임.
                return curDist;
            }

            //(1,1)에서 동쪽 가려면 (0,1)만큼 이동해서 (1,2)가 됌.
            for (int[] direction : directions) {
                for (int i = 0; i < direction.length; i++) {
                    int nextX = curX + direction[0];
                    int nextY = curY + direction[1];

                    if (isInRange(nextX, nextY, rowLength, colLength, maps)) {
                        if (!visited[nextX][nextY]) { //아직 안 밟았으면
                            queue.offer(new int[]{nextX, nextY,
                                curDist + 1}); //Q. 왜 curDist++로 하면 최단거리 1 나오지?
//                            count = count + 1;
//                            System.out.println("COUNT" + count);
                            //Q. 왜 그냥 count + 1 올리면 모든 1타일을 세지?

                            visited[nextX][nextY] = true; //방문 리스트에 추가
                        }
                    }
                }
            }
        }
        return -1;
    }
}