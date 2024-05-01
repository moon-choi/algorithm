import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int solution(int number, int limit, int power) {
        int[] arr = getWeapons(number);
        int sum = 0;
        
        for (int num : arr) {
            if (num > limit) {
                num = power;
            }
            sum += num;
        }

        return sum;
    }

    public static int getNumberOfDivisors(int number) {
        int count = 0;
        Set<Integer> divisors = new HashSet<>();

        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                divisors.add(i);
                divisors.add(number / i);
            }
        }

        return divisors.size();
    }

    public static int[] getWeapons(int number) {
        int[] arr = new int[number];
        for (int i = 1; i <= number; i++) {
            arr[i - 1] = getNumberOfDivisors(i);
        }

        return arr;
    }
}