class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        //x = 갈색의 가로
        //y = 갈색의 세로
        //2x + 2(y - 2) = brown
        //2(x + y - 2) = brown

        //x - 2 = 노란색의 가로
        //y - 2 = 노란색의 세로
        //(x - 2) * (y - 2) = yellow

        for (int x = 1; x < 5000; x++) {
            for (int y = 1; y <= x; y++) {
                if ((x - 2) * (y - 2) == yellow && (x + y - 2) * 2 == brown) {
                    answer[0] = Math.max(x, y);
                    answer[1] = Math.min(x, y);
//                    break;
                }
            }
        }

        // System.out.println(Arrays.toString(answer));

        return answer;
    }
}