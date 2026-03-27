public class array6 {
    public static void main(String[] args) {
        int arr[]={2,5,3,4,6,25,76,11,60};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void reverse(int arr[]) {
       int start=0,end=arr.length-1;
       while(start<end){//yaha prstart<=end karne ans same ayega lekin ek step extra chaljayega same value interchange hokar waps origina ho jayegi
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
       }//maine yha arr ki copy banakar use change kr diya reverse
        
    }
    
}
