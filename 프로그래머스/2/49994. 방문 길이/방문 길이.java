import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public static int solution(String dirs) {
        Set<String> visited = new HashSet<>();

        Map<Character, int[]> moves = new HashMap<>();
        moves.put('U', new int[]{0, 1});
        moves.put('D', new int[]{0, -1});
        moves.put('R', new int[]{1, 0});
        moves.put('L', new int[]{-1, 0});

        String path = "";
        int[] pos = {0, 0};

        //첫 좌표 0,0
        int x = pos[0];
        int y = pos[1];
        for (char dir : dirs.toCharArray()) { //UP {0,1}

            //이동시킴
            int nX = x + moves.get(dir)[0]; //0
            int nY = y + moves.get(dir)[1]; //1

            //유효하면 path로 기록하고 visited에 저장
            if (isInRange(nX, nY)) {
                switch (dir) {
                    case 'U':

                    case 'R':
                        path = "" + x + "," + y + "," + nX + "," + nY;
                        // System.out.println("R path:" + path);
                        break;

                    case 'D':
                    case 'L':
                        path = "" + nX + "," + nY + "," + x + "," + y;
                        // System.out.println("L path:" + path);
                        break;
                }
                //좌표 옮겨줌
                x = nX;
                y = nY;

                // System.out.println("nX, nY: " + nX + ", " + nY);
            }

            visited.add(path);
        }
        System.out.println("VISITED SIZE: " + visited.size());
        return visited.size();
    }

    public static boolean isInRange(int x, int y) {
        return (x <= 5 && x >= -5) && (y <= 5 && y >= -5);
    }
}