class SecondLargest{

    public static int secondLargest(int arr[]){
        int max=Integer.MIN_VALUE;
        int secondlarge=Integer.MIN_VALUE;

        for(int value:arr){
            if(value>max){
                secondlarge=max;
                max=value;
            }else{
            if(value>secondlarge && value!=max){
                secondlarge=value;
            }
            }
        }
    return secondlarge;
    }

    public static void main(String[] args) {
        int arr[]={23,89,18,38,47,39,-24};
        System.out.println(secondLargest(arr));
        
    }
}