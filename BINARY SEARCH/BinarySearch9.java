public class BinarySearch9 {
    public static void main(String[] args) {
        int arr[][]={{1,6,12,27,32},{38,41,47,49,55},{67,68,75,76,81},{84,89,91,92,98}};
        System.out.println(search(arr,49));;
    }
    public static boolean search(int[] []arr,int target) {
        
        int rows=arr.length;int cols=arr[0].length;
        int l=0;int h=rows*cols-1;
        while(l<=h){
            int mid=(l+h)/2;
            int midrows=mid/cols;
            int midcols=mid%cols;
            if(arr[midrows][midcols]==target){
                return true;
                
            }
            else if(arr[midrows][midcols]>target){
                h=mid-1;
            }
            else {
                l=mid+1;
            }

        }
        return false;








        
        
        
    }
}
