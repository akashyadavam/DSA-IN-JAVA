public class BinarySearch4 {
    public static void main(String[] args) {
        int arr[]={100,91,87,76,66,52,43,35,29,13,5};
       System.out.println( searchdescending(arr,29));;

    }
    public static int  searchdescending(int [] arr,int target) {
         int i=0,j=arr.length-1;
        
        while(i<=j){
            int mid=(i+j)/2;
        if(arr[mid]>target) {
            i=mid+1;
        }
        else if (arr[mid]<target){
            j=mid-1;
        }
        else{ 
            return mid;}
        }
         return -1;
    }
    }

