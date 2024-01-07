// Sort an array of 0s, 1s and 2s | Dutch National Flag problem
import java.util.Scanner;

public class test7 {
    static void sort(int[] arr,int n){
        int low=0,key=0,high=n-1;
        while (key<=high) {
            switch (arr[key]) {
                case 0:
                    int temp=arr[low];
                    arr[low]=arr[key];
                    arr[key]=temp;
                    key++;
                    low++;
                    break;
                case 1:
                        key++;
                        break;
                case 2:
                    temp=arr[high];
                    arr[high]=arr[key];
                    arr[key]=temp;
                    high--;
                    break;
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr = new int[]{ 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n=arr.length;
        sort(arr,n);
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
    
}
