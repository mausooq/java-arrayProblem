// Find a peak element which is not smaller than its neighbours

import java.util.Scanner;
class maximum{

    int max(int arr[],int n){
        System.out.println(System.currentTimeMillis());
        if(n==0)
            System.out.println(arr[0]);
        if(arr[0]>=arr[1])
            System.out.println(arr[0]);
        if(arr[n-1]>=arr[n-2])
            System.out.println(arr[n-1]);
        for (int i = 1; i < n-1; i++) {
            if(arr[i-1]<=arr[i] && arr[i+1]<=arr[i]){
                    System.out.println(arr[i]);
            }
        }
        System.out.println(System.currentTimeMillis());
        return 0;
        
    }
}
public class test1 {
    
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
        maximum obj=new maximum();
        System.out.println("peak element");
        obj.max(arr, n);
        in.close();
    }
}
