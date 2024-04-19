class Solution {
    
    static int answer = 0;
    
    public static int solution(int[] numbers, int target) {

        dfs(0, 0, numbers, target);
        System.out.println(answer);
        return answer;
    }

    private static void dfs(int sum, int idx, int[] numbers, int target) {
//        if (idx == numbers.length && sum == target) {
//            answer += 1;
//            return;
//        }

        if (idx == numbers.length) {
            if (sum == target) {
                answer++;
                // return;
            }
           return;
        }

        if (idx >= numbers.length) {
            return;
        }
        dfs(sum + numbers[idx], idx + 1, numbers, target);
        dfs(sum - numbers[idx], idx + 1, numbers, target);
    }
}