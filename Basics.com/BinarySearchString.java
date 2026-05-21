public class BinarySearchString {
    public static void main(String[] args) {
        String names[]={"bahu","deva","soma","tarun"};
        String target="soma";

        int left=0;
        int right=names.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            int cmp=names[mid].compareTo(target);
            if(cmp==0){
                System.out.println("Element found at index: "+mid);
                return;
            } else if(cmp<0){
                left=mid+1;
            } else {
                right=mid-1;
            }
        }
        System.out.println("Element not found in the array.");
    }
}
