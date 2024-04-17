import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
      
      int[] result = new int[commands.length]; //결과를 넣을 배열 만들어줌. 
        
        int x = 0;
      
        for(int[] command : commands) {
        int i = command[0]; //시작점
        int j = command[1]; //끝점
        int k = command[2]; //k번째 수. 
          
        int[] cutArr = Arrays.copyOfRange(array, i - 1, j); //배열 복사. 
        Arrays.sort(cutArr); //정렬
        int kVal = cutArr[k - 1]; //인덱스는 항상 k번째보다 1 작음. (0부터 시작하므로)
        
        result[x++] = kVal;
             
      }
  
      return result;

    }
}