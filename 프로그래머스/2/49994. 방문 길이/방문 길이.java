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

        int[] pos = {0, 0};
//        int x; //0
//        int y; //0
        String path = "";
        //시작 {0,0}
        int x = 0;
        int y = 0;
        for (char dir : dirs.toCharArray()) { //UP {0,1}
            //현재 좌표

            //이동시킴
            int nX = pos[0] + moves.get(dir)[0]; //0
            int nY = pos[1] + moves.get(dir)[1]; //1

            //유효하면 path로 기록하고 visited에 저장
            if (isInRange(nX, nY)) {
                switch (dir) {
                    case 'U':
                    case 'R':
                        path = "" + x + y + nX + nY;
                        break;

                    case 'D':
                    case 'L':
                        path = "" + nX + nY + x + y;
                        break;
                }


            }

            //좌표 옮겨줌
            x = nX;
            y = nY;
            visited.add(path);
        }

        System.out.println("VISITED SIZE: " + visited.size());
        return visited.size();

    }

    public static boolean isInRange(int x, int y) {
        return (x <= 5 && x >= -5) && (y <= 5 && y >= -5);
    }
}