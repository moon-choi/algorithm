import java.util.*; 

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
                       
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            } else {
                continue;
            } 
        }
        
        if (list.size() < 1) {
            list.add(-1);
        }
                
        int[] answer = new int[list.size()];
        
        for(int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}