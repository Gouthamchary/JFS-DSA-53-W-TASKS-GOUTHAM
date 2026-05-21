import java.util.Arrays;

public class UpdatedElement {
    public static void updatElement(int arr[],int size,int pos,int element){
        if(pos<0 || pos>=size){
            System.out.println("Invalid Position");
        }
        else{
            arr[pos]=element;
            System.out.println("Updated Element Position: "+pos+ " Updated Element : "+element);
        }
    }
    public static void main(String[] args) {
        int arr[]={15,17,19};
        System.out.println("Initial Array: ");
        System.out.println(Arrays.toString(arr));
        UpdatedElement.updatElement(arr, 3, 1, 18);
        System.out.println("Updated Array: ");
        System.out.println(Arrays.toString(arr));
    }
}
