public class ArrayUser {
    public static void main(String[] args) {
        //Array taking from user input without using scanner class
        int nums[]={10,20,30,40,50};
        //length of array
        int len=nums.length;
        System.out.println("Length of array: "+len);
        System.out.print("Values in array are: ");
        //accessing values entire
        for(int i=0;i<len;i++){
            System.out.print(nums[i]+" ");
        }


    }
}
