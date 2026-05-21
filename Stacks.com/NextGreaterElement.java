import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr) {
        int n= arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={4,5,8,12,3,2,9,1};
        System.out.println("Original Array: "+Arrays.toString(arr));
        int result[]=nextGreaterElement(arr);
        System.out.println("Next Greater Element: "+Arrays.toString(result));
    }
}
