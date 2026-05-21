import java.util.Arrays;

public class PanCake {

    public static void flip(int arr[],int end){
        int start=0;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        //System.out.println("After Reverse : "+Arrays.toString(arr));
    }
    public static int findMax(int arr[],int n){
        int maxInd=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[maxInd]){
                maxInd=i;
            }
        }
        return maxInd;
    }

    public static void pansortLogic(int arr[]){
        int n=arr.length;
        for(int currSize=n;currSize>1;currSize--){
            int maxInd=findMax(arr,currSize);
            //System.out.println("Current Size : "+currSize);
            //System.out.println("Max Index : "+maxInd);
            if(maxInd!=0){
                flip(arr, maxInd);
            }
            flip(arr, currSize-1);
        }   
    }
    public static void main(String[] args) {
        int[] arr={3,6,8,9,7,5,4};
        System.out.println("Before Sort : "+Arrays.toString(arr));
        pansortLogic(arr);
        System.out.println("After Sort : "+Arrays.toString(arr));
    }
}
