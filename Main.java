import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));

        for (; 0 < list.size(); ) {
            list.remove(0);
            System.out.println(list);
        }

        int[][] arr1 = {{1, 2}, {3, 4}};
        int[][] arr2 = Arrays.copyOf(arr1, arr1.length);
        int[][] arr3 = Arrays.copyOf(arr1, arr1.length);
        arr3[0] = Arrays.copyOf(arr1[0], arr1[0].length);
        arr3[1] = Arrays.copyOf(arr1[1], arr1[1].length);

        System.out.println(arr1.equals(arr2));
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.deepEquals(arr1, arr2));

        System.out.println(arr1.equals(arr3));
        System.out.println(Arrays.equals(arr1, arr3));
        System.out.println(Arrays.deepEquals(arr1, arr3));
    }
}
