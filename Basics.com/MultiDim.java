public class MultiDim {
    public static void main(String[] args) {
        int[][] arr={ 
            {10,20},
            {12,22,32},
            {15,30,45}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
