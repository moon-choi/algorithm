import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;      
        int[] biggerNums = new int[sizes.length];
        int[] smallerNums = new int[sizes.length];

        //가로, 세로 상관 없이 앞에 큰수, 뒤에 작은 수 놓기.
        for(int i = 0; i < sizes.length; i++) {
            
            int[] size = sizes[i];
            
            if(size[0] < size[1]) { //자리 바꿔치기
                int temp;
                temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
            
            biggerNums[i] = size[0]; //큰수 따로 저장
            smallerNums[i] = size[1]; //작은 수 따로 저장
        }

        //큰 수들 중 최대값 구하기
        Arrays.sort(biggerNums); //오름차순 정렬
        int maxBiggerNums = biggerNums[biggerNums.length - 1]; //최대값. 얘는 고정. 

        //작은 수들 중 최대 값 구하기
        Arrays.sort(smallerNums); //오름차순 정렬
        int maxSmallerNums = smallerNums[smallerNums.length - 1]; //최대값

        //곱하기
        answer = maxBiggerNums * maxSmallerNums;
        return answer;
    }
}