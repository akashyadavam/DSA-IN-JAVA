import java.util.*;

public class Input2dArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][4];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                 arr [i][j]=sc.nextInt();//take input 4*3 time
                 
            }
        }
        for(int []a:arr){
            for(int ele:a){
                System.out.print(ele+" ");
            }
            
        }
       
    
}
}
