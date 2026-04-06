public class RecursionOnArrays {
    public static void main(String[] args) {
        int arr[]={2,5,3,2,6,791,4};
        print(arr,0);
    }
    static void print(int arr[],int idx){
        if(idx==arr.length) return;
         System.out.print(arr[idx]+" ");
        print(arr,idx+1);
         System.out.print(arr[idx]+" ");
    }
    
}
