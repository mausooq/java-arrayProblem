// sort array 
import java.util.Scanner;

public class test4 {
    static  void sort(int arr[],int n){
        int i,j,min,temp;
        for(i=0;i<n;i++){
            min = i;
            for(j=i+1;j<n;j++){
                if (arr[j] < arr[min]){
                    min = j;

                    
                }
                temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("enter array size");
        n=in.nextInt();
        int arr[] = new int[n];
        System.out.print("Entered array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        sort(arr,n);
        System.out.print("sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
            in.close();
        }
    }
}
