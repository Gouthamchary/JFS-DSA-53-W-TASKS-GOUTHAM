public class MinMax {
    public static void main(String[] args) {
        int arr[]={15,1,14,50,68};
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
    }
}
