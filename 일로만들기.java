public class 일로만들기 {
    public static void main(String[] args) {
    int[] num_list = {12, 4, 15, 1, 14};
    int count = 0;

    for (int num : num_list) {
      while (num != 1) {
        if (num % 2 == 0) {
          num = num / 2;
          count++;
        } else {
          num = (num - 1) / 2;
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
