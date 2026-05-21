public class SecondMin {
    public static int secondMin(int arr[]){
        int min=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;

        for(int values:arr){
            if(values<min){
                secondmin=min;
                min=values;
            }else{
                if(values<secondmin && values!=min){
                    secondmin=values;
                }
            }
        }
        return secondmin;
    }
    public static void main(String[] args) {
        int arr[]={2,2,2,2,2};
        System.out.println(secondMin(arr));
    }
}
