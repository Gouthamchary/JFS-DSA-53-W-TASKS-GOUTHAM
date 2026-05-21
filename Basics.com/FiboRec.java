public class FiboRec {
    public static int fiborec(int n){
        
        // give me exact output

        if (n<=1){
            return n;
        }
        return fiborec(n-1)+fiborec(n-2);
        
    }
    public static void main(String[] args) {
        
        System.out.println(fiborec(5));
    }
}
