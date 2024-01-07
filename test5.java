// Kth Smallest/Largest Element in Unsorted Array
import java.util.*;
import java.util.Arrays;
public class test5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int arr[] = new int[]{12, 34, 67, 90,4,55,2,1,-1};
        Arrays.sort(arr);
        int k=in.nextInt();
        System.out.println("K th smallest element "+arr[k-1]);
        in.close();
    }
}
