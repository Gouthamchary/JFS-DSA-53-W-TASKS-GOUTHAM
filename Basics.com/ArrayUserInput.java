import java.util.Scanner;
public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Elements in array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
