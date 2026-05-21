public class ArrayBinarySearch {
    public static int[] searchRange(int arr[],int target){
        int first=searchIndex(arr, target,true);
        int last=searchIndex(arr, target,false);
        return new int[] {first,last};
    }
    public static int searchIndex(int arr[], int target,boolean isFirst){
        int left=0;
        int right=arr.length-1;
        int index=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                index=mid;
                if(isFirst){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5};
    
        //int[] arr1=new int[arr.length+1];
        //int num=0;
        int result[]=searchRange(arr, 3);
        System.out.print(result[0]+" ");
        System.out.print(result[1]);
    }
}
