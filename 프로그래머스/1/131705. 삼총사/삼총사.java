import java.util.Arrays;

class Solution {
    int[] three = new int[3];
    int answer = 0;
    
    public int solution(int[] number) {
        combination(0, 0, number);
        return answer;
    }
    
 	// 조합 메서드(cnt는 선택 횟수, idx는 다음 대상을 선택할때 집합에서 탐색을 시작할 인덱스).   
    public void combination(int cnt, int idx, int[] number) {
		// 3개를 선택했으므로, 결과를 출력하고 재귀를 종료한다.
		if (cnt == 3) {
			System.out.println(Arrays.toString(three));
			if(isTrio(three)) answer++;    
            return;
		}
		
		// 대상 집합을 주어진 인덱스부터 순회하며 숫자를 하나 선택한다.
		for (int i = idx; i < number.length; i++) {
			// 숫자를 담는다.
			three[cnt] = number[i]; 

			// 자신을 재귀 호출한다(자신 이전의 수를 중복 선택하지 않도록 인덱스를 +1하여 재귀를 호출한다).
			combination(cnt + 1, i + 1, number);
		}
		
	}
	
    public boolean isTrio(int[] result) {
        int total = 0;

        for (int num : three) {
            total += num;
        }

        return total == 0;
    }
}