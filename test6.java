// Count number of occurrences (or frequency) in a sorted array
import java.util.*;
public class test6 {
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
        System.out.println("enter the value of x :");
        int x=in.nextInt();
        int cnt=0;
        for (int i = 0; i < n; i++) {
            
            if(arr[i]==x){
                cnt++;
            }
        
        }
        if(cnt==0)
            System.out.println("number doesnt exist ");
        else
            System.out.println(cnt);
        in.close();
    }
}
