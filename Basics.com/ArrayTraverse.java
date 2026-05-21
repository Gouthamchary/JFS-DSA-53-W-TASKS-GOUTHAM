class ArrayTraverse{
    public static void main(String[] args) {
        String arr[]={"bahubali","devasena","kattappa","rajamatha"};
        System.out.println("Traditional For Loop:");
        //Traditional For Loop.
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println("Enhanced For Loop:");
        //Enhanced For Loop.
        for(String num:arr){
            System.out.println(num);
        }
    }
}