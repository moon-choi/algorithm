class Solution {
    
    static int answer = 0;
    
    public static int solution(int[] numbers, int target) {

        dfs(0, 0, numbers, target);
        System.out.println(answer);
        return answer;
    }

    private static void dfs(int idx, int sum, int[] numbers, int target) {
        if (idx == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }

        dfs(idx + 1, sum + numbers[idx], numbers, target);
        dfs(idx + 1, sum - numbers[idx], numbers, target);
        
    }
}   