public class FiboIter {
    public static int fibonac(int n){
        if (n<=1){
            return n;
        }
        int n1=0;
        int n2=1;
        int res=0;
        for(int i=1;i<=n;i++){
            System.out.print(n1+" ");
        res=n1+n2;
        n1=n2;
        n2=res;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(fibonac(5));
    }
}
