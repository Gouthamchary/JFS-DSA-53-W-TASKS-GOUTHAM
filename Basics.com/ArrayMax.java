public class ArrayMax {
    public static void main(String[] args) {
        //Maximum Element in Array
        int arr[]={15,80,89,25,48,18};
        int maxVal=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }   
        }
        System.out.print(maxVal);
        
}
}
