public class MinElementCount {
    public static void main(String[] args) {
        int arr[]={4,5,7,6,4,7,4,5,6};
        int min=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(min==arr[i]){
                count++;
            }
        }
        
        System.out.println(min);
        System.out.println(count);
    }
}
