public class array12 {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kadan(arr);
    }
    public static void kadan(int[] arr) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            cs=cs+arr[i];
            // if(cs<0){
            //     cs=0;
            // } //agar positive naswr ana honga tab use upar varna niche krna ms ke niche kyoki phir negative meinnmax khojenge boss;
            ms=Math.max(cs,ms);
            if(cs<0){
               cs=0;
            }// ye jyada better rhenga kyoki negative mein maximum ka dhyan rakhte huwe chalega boss;

        }
        System.out.print("LARGESTSUM="+ms);
        
    }
    
}
