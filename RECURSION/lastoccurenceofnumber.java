public class lastoccurenceofnumber {//this is my first stategy
    public static void main(String[] args) {
         int arr[]={1,2,3,4,5,6,9,8,9,5,98,5};
        
      //System.out.println( check(arr,5,0));
      check(arr,5,0);
    

        
    }
   public static void check(int arr[],int key,int i) {
   
    if(i==arr.length-1){
         return ;
       

    }
    else{
          if(arr[arr.length-1]==key){
        System.out.println("last occurence is:"+arr.length);
        return;
        
        
    }
    }
    
   
     check(arr, key, i+1);
    if(arr[i]==key){
        System.out.println(i);
        return;
        
    }
   

   
    
}
}
