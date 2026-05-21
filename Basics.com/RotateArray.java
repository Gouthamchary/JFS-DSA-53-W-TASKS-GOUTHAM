import java.util.Arrays;

public class RotateArray {
    public static void rotateArray(int arr[], int k){
        k=k%arr.length;
        reverse(arr,0,arr.length-1);         
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
    }
    public static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("Initial Array: " + Arrays.toString(arr));
        rotateArray(arr, 3);
        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }
}
