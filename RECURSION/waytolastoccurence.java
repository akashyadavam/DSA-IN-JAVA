public class waytolastoccurence {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,5,34,5};//always rember akhiri wala check nahi ho payenge;
        System.out.println(check(arr,5,0));;
    }
    public static int check(int[] arr,int key,int i) {
        if(i==arr.length-1){
            return -1;
        }
        int last=check(arr,key,i+1);
        if(last==-1&&arr[i]==key){
            return i;
        }
        return last;
        
    }
    
}
