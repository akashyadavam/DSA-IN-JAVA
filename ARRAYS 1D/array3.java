public class array3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,12,34,12,31,32};
        int key=12;
      int index=linearsearch(arr,key);
      if(index!=1)
      System.out.println("found index "+index);
      else
      System.out.println("not found "+index);
        
}
public static int linearsearch(int arr[],int key) {
    
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
        return i;//ye return key wahi ab index ki value ho jayengi;
    }
    
    
}
return 1;
}
    
}
