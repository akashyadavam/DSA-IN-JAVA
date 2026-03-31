 public class MinellementOfallrowofMaximumelement {
    // min elemnt of all maximum element of each row;
     public static void main(String[] args) {
        
        int k=Integer.MAX_VALUE;
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
         for(int i=0;i<arr.length;i++){
            int max=0;
            for(int j=0;j<arr[0].length;j++){
                 if(arr[i][j]>max){
                    max=arr[i][j];
                 }
            }
            if(k>max){
                k=max;
            }
            
            
           
         }
         System.out.println(k);
        //  here k is smallest out of all maximum element of each row ;
}
}