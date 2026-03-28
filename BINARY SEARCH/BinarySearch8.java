public class BinarySearch8 {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,10,1,2,3};
        System.out.println(search(arr,10));


    }
    public static int search (int[] arr,int target) {
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>arr[l]){
                if(arr[l]<=target&& target <arr[mid]) h=mid-1;
                else l=mid+1;
            }
            else{
                 if(arr[mid]<target&& target<=arr[h]) l=mid+1;
                else h=mid-1;
            } 
        }
        return -1;
    }
}
