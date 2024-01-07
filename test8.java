// finding sum of 3 i array 
import java.util.Scanner;
public class test8 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr = new int[]{ 15, 2, 4, 8, 9, 5, 10, 23};
        System.out.println("enter sum");
        int x=in.nextInt();
        int sum=0,prev=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    sum=arr[i]+arr[j]+arr[k];
                    if(sum<=x){
                        prev=sum;
                        if(prev==x){
                            System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
                            System.out.println();
                        }
                    }
                }
                in.close();
            }
            
        }
    }
}
