public class ArrayInsert {
    public static void main(String[] args) {
        int arr[]={15,4,8,7,18,19};
        int pos=2;
        int element=17;
        //Creating new array with size one more than original array.
        int newArr[]=new int[arr.length+1];

        //sending before index values.
        for(int i=0;i<pos;i++){
            newArr[i]=arr[i];
        }
        
        //Inserting element at specific position.
        newArr[pos]=element;
        for(int i=pos;i<arr.length;i++){
            newArr[i+1]=arr[i];
        }
        //Printing new array.
        for(int values:newArr){
            System.out.print(values+" ");
        }
    }
}
