class BubbleSort {
    public static void bubbleSort(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
        }
        System.out.println("Number of swaps: "+count);
    }
    public static void main(String[] args) {
        int[] arr={5,2,4,1,3,6};
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}


