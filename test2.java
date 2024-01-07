//find minmum and maximum in array
import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int arr[] = {1, 22, 2, 66, 24, 56, 80, 99, 100, -3, -8, 44};
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[arr.length - 1]);
    }
}
