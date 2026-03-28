public class BinarySearch5 {
    public static void main(String[] args) {
        int arr []={-3,-2,-1,1,2,3,4,5,6};
       System.out.print( maxpositive(arr));;
        // maxnegative(arr);
    }
    public static int  maxpositive(int arr[]) {
          int i=0,j=arr.length-1;
         int max=-1;
        while(i<=j){
            int mid=(i+j)/2;
        if(arr[mid]>0) {
            max=arr.length-mid;
             j=mid-1;

        }
        else{
            i=mid+1;
        }
        
    }
    int l=0;
        int m=arr.length-1;
        int maxx=-1;
        while(l<=m){
            int mid=l+(m-l)/2;
            if(arr[mid]<0){
                maxx=mid+1;
                l=mid+1;
                
            }
            else{
                m=mid-1;
            }

        }
        // return max;
        // return maxx;
        return Math.max(max, maxx);
        
    
   
}
}
