public class array9 {
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        maxsumsubarray(arr);
    }
    public static void maxsumsubarray(int[] arr) {
        int max=Integer.MIN_VALUE;//ratta mar lo is method ko;
       
        for(int i=0;i<arr.length;i++){

          int  start=i;
             for(int j=i;j<arr.length;j++){
              int  currsum=0;//variable ke naam mein gap nahi dena hota hai;andar cursum=0 isliye diya 
                //kyoki hary subarray ka sum nikalana chahta haialag dusra ka add na ho jaye;
                int end=j;
                for(int s=start;s<=end;s++){//is wale loop ka kam hai print karana
                currsum+=arr[s];
                }
                if(currsum>max){
                    max=currsum;
                }
             }
             
        }
        System.out.println(max); 
    }
}    

