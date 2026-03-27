import java.util.*;
public class array4 {
     public static void main(String[] args) {
        int arr[]={17,2,3,4,5,12,34,1,12,31,32};
        
        
      int ans=largest(arr);
      
      System.out.println("largest "+ans);
    
        
}
public static int largest(int arr[]) {
    int max=0;
    int n=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
        max=arr[i];
        }
        if(arr[i]<n){
            n=arr[i];//jaha par sabse chota milega uske bad age badenga hi nahi
            
        
        }
        //YAD RAKHNA DO BAR IF IF USED HONE SE HAR BAR DONO STEP CHECK HUYE TRUE FALSE KA PANGA HI NAHI HAI
        //AGAR IF IFELSE USED KARENGE JAB PAHLA STATEMENT HIT HONGA TO DUSRA NAHI HONGA ''
        
        
    }
     System.out.println("smallest "+n);
        
    return max;
    
}
}
