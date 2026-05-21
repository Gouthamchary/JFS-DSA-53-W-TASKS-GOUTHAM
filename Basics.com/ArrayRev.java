public class ArrayRev {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int len=arr.length;
        System.out.println("Reverse Array: ");
        for (int i=len-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
