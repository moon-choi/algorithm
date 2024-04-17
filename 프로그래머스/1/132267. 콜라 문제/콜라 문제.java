class Solution {
    public int solution(int a, int b, int n) {
        int totalGet = 0;
            int give = 0;
            int get = 0; //지금 얻는 병.
            int set; //몇 세트.

            do {
                set = n / a; //몇 세트 돌려받을 수 있는지.
                give = set * a; //지금 내는 병.
                get = set * b; //지금 얻는 병.
                
                n = n - give + get;
                totalGet += get; //새로받은 병 누적.
          } while (n >= a);

          return totalGet;
    }
}
