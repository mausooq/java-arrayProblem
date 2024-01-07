// Move all negative numbers to beginning and positive to end with constant extra space
public class test10 {
    static void arrange(int[] arr){
        int j=0,temp=0;
        int i=0;
        while(i<arr.length){
                if(arr[i]<0){
                    if(i!=j){
                            temp=arr[j];
                            arr[j]=arr[i];
                            arr[i]=temp;
                }
                j++;
                }
            i++;  
        }
}
        

    public static void main(String[] args) {
        int arr[]={1,2,3,0,-4,5,-9,-3,-1,-6};
        arrange(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
