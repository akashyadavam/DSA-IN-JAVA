public class checksortedarray {
      public static void main(String[] args) {
      int arr[]={1,2,3,4,5,6,9,8};
      System.out.println( check(arr,0));
    
}
public static boolean check(int[] s,int i) {
    if(i==s.length-1){
        return true;
    }
   
    if(s[i]>s[i+1]){
        return false;

    }
  

    
     return check(s,i+1);
    

    
    
}
}
