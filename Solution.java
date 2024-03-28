//프로그래머스 작동 원리
public class Solution {
  public int solution() { //solution 함수는 풀이 로직 담고 있음.
    int num = 3;
    System.out.println(num);
    return num; //solution 함수는 꼭 정답을 반환해야함.
  }

  //뒤에 숨은 메인이 Solution 쿨래스 안의 solution 메소드를 호출함.
  public static void main(String[] args) {
    Solution moon = new Solution();
    moon.solution(); //그래야 호출하면 정답이 나옴.

    System.out.println(  (int)(Math.random()*10 + 1  ));
    System.out.println(   (int)(Math.random()*10) + 1   );
  }
}
