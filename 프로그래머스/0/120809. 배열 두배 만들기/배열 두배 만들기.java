import java.io.*; 
import java.lang.*; 
import java.util.*;

class Solution {
    
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
              
        if(numbers.length < 0) {
            System.out.println("array length is less than zero");
        } else {
            try {
                for (int i = 0; i < numbers.length; i++) {
                    answer[i] = numbers[i] * 2;
                }
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e);       
            }
        }
             
        return answer;
    }
}