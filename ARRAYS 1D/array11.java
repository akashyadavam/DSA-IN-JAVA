public class array11 {
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        maxsumsubarray(arr);
    }
    public static void maxsumsubarray(int[] arr) {
        int max=Integer.MIN_VALUE;//very important method hai kisi bhi bich ka subarray ka sum bhi count krne mein helpful;
        int currsum=0;
        int prefix[]=new int[arr.length];
       prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
          int  start=i;
             for(int j=i;j<arr.length;j++){
                currsum=0;//variable ke naam mein gap nahi dena hota hai;
                int end=j;
                for(int s=start;s<=end;s++){//is wale loop ka kam hai print karana
                currsum=start==0 ?prefix[end]:prefix[end]-prefix[start-1];
                //
                }
                if(currsum>max){
                    max=currsum;
                }
             }
             
        }
        System.out.println(max); 
    }
    
}
