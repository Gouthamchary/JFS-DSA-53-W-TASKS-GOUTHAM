import java.util.Arrays;
class ArrayMethods{
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={1,2,3,4};

        boolean isEqual=Arrays.equals(arr1,arr2);
        System.out.println("Equal or not: "+isEqual);

        int cpy[]={1,2,4,6,7,8};

        int[] newArr=Arrays.copyOf(cpy,10 );
        System.out.println(Arrays.toString(newArr));

        int cpr[]={34,90,19,37,4,18,3,7,49,19,27};
        int[] newArr1=Arrays.copyOfRange(cpr,3,17);
        System.out.println("New Array is :"+ Arrays.toString(newArr1));

        int fnew[]=new int[5];
        Arrays.fill(fnew,19);
        System.out.println(Arrays.toString(fnew));


    }
}