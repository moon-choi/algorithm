class Solution {
    public static int solution(int n) {
        int answer = 0;
        
        int[] arr = new int[n+1]; //여기서 
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
           // arr[i] = ( (arr[i - 1] % 1234567) + (arr[i - 2] % 1234567) ) % 1234567;
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
            answer = arr[i];
        }
        return (int) answer;
    }
}