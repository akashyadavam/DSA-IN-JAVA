public class MaxisumSumRow {
    public static void main(String[] args) {
        
        int max=0;
        int maxsumrow=0;
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
         for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                  sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
                maxsumrow=i;

            }
           
         }
            System.out.println("MaxisumSumRow is"+"="+maxsumrow+"and sum is:"+max);
             }
             }

