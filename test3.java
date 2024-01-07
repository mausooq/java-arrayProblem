// reverse array
public class test3 {
    static void rev(int arr[],int start,int end){
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println("reverse element");
        rev(arr,0,5);
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
    }
}
