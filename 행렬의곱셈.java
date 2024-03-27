public class 행렬의곱셈 {
  public static void main(String[] args) {
    int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
    int[][] arr2 =	{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
    int[][] answer = {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}};
    int[][] result = new int[arr1.length][arr2.length];
    int crossed = 0;
    int multiplied = 0;
    int sum = 0;
    int added = 0;
    for(int i = 0; i < arr1.length; i++) {

      for(int j = 0; j < arr1[i].length; j++){

        for(int k = 0; k < arr2[j].length; k++) {



          multiplied = arr1[i][j] * arr2[j][i];
          sum += multiplied;
          System.out.println(sum);
        }

//                System.out.println(multiplied);
//                System.out.println(i + "," + j + " * " + j + "," + i);

      }

      System.out.println("==");




    }

    //arr1에서 첫덩어리가 arr2의 모든 판을 다 돌고나면 result의 한 줄이 채워짐.
  }
}
