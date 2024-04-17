public class 코테1회2번 {

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4});
        solution(new int[]{1, 2, 7, 6, 4});
    }

    public static int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums [j] + nums[k];
                    if(isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
