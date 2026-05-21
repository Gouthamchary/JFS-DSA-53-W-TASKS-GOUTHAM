public class StringRev {
    //string reversing
    public static String reverseString(String str) {
        //without using string builder
        String res="";
        for(int i=str.length()-1;i>=0;i--){
            res=res+str.charAt(i);
        }
        return res;

    }
    public static void main(String[] args) {
        System.out.println(reverseString("Goutham"));
    }
}
