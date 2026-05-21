public class ArrayDlt {
    public static void main(String[] args) {
        int arr[]={14,54,47,48,15};

        int pos=2;
        
        int newArr[]=new int[arr.length-1];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(i==pos){
                continue;
            }
            newArr[j]=arr[i];
            j++;
        }
        for(int values:newArr){
            System.out.print(values+" ");
        }
        
}
}
