public class BinarySearch3 {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,5,6,8,6,3};
       System.out.println( peak(arr));
           
    }
    public static int peak(int[] arr) {
        int i=1,j=arr.length-2;
        while(i<=j){
            int mid=(i)+(j-i)/2;
            if(arr[mid]<arr[mid+1]&&arr[mid]>arr[mid-1]){
               i=mid+1;

            }
            else if (arr[mid]>arr[mid+1]&&arr[mid]<arr[mid-1]){
                j=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
        
    }
}
