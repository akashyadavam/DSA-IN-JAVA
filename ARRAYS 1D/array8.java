public class array8 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        subarray(arr);
    }
    public static void subarray(int[] arr) {
        int ts=0;
        for(int i=0;i<arr.length;i++){

          int  start=i;
             for(int j=i;j<arr.length;j++){
                int end=j;
                for(int s=start;s<=end;s++){//is wale loop ka kam hai print karana
                    System.out.print(arr[s]+" ");
                }
                ts++;
                System.out.println();
               
             }
             System.out.println();
        }
        System.out.println(ts);
        
    }
    
}
