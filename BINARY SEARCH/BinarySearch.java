public class BinarySearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
       System.out.println( search(arr,5));;
    }
    public static int search(int [] arr,int target) {
        int i=0,j=arr.length-1;
        
        while(i<=j){
            int mid=(i+j)/2;
        if(arr[mid]>target) {
            j=mid-1;
        }
        else if (arr[mid]<target){
            i=mid+1;
        }
        else{ 
            return mid;}
        }
         return -1;
    }
    
}
