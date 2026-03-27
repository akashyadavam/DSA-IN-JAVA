public class array13 {
    public static void main(String[] args) {
        
    
    int arr[]={7,1,5,3,6,4};
    int ans=stock(arr);
    System.out.println(ans);


}
    public static int stock(int[] arr) {
        int bp=Integer.MAX_VALUE;
        int maxprofit=0;int n=arr.length;
        for(int i=0;i<n;i++){
            if(bp<arr[i]){
                int profit=arr[i]-bp;
                maxprofit=Math.max(profit,maxprofit);

            }
            else bp=arr[i];
        }
        return maxprofit;

        
    }
    
    
}

