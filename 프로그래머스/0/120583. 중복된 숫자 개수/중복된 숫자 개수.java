class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int el : array) {
            if(el == n) {
                answer++;
            }
        }
        return answer;
    }
}