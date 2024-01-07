// Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.

// Note: There may be more than one subarray with sum as the given sum, print first such subarray. 

// Examples: 

// Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
// Output: Sum found between indexes 2 and 4
import java.util.Scanner;
public class test9 {
    static void sum(int[] arr, int n, int x){
        for (int i = 0; i < n; i++) {
            int newsum=arr[i];
            if(newsum==x){
                System.out.println("Element found at index "+i);
                return;
            }
            for (int j = i+1; j < n; j++) {
                newsum+=arr[j];
                if(newsum==x){
                    System.out.print("Element found at indices "+i+ " to "+j);
                    return;
                }
            }
            
        }
        System.out.println("No subarray found");
        return;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr = new int[]{ 23, 2, 4, 8, 9, 5, 10, 23};
        System.out.println("enter sum");
        int x=in.nextInt();
        sum(arr,arr.length,x);
        in.close();
    }
}
