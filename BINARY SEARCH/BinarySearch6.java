public class BinarySearch6 {
    public static void main(String[] args) {
        int arr[]={1,2,8,10,10,12,19};
        System.out.println(floor(arr,5));
        
    }
    public static int floor(int[] arr,int k) {
        int indx=-1;
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]>k){
                j=mid-1;
                // bade wale chahiye nahi

            }
            else{
                indx=mid;
                // chota wala chahiye aur age jao jab tak target se chota hai;
                i=mid+1;
            }
            
        }
       return indx; 
    }
   
}
