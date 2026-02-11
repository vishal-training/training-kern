import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1};

        Arrays.sort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
