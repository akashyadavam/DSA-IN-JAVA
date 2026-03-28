import java.util.Scanner;

public class BinarySearch7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sqrt(n));
    }
    public static int sqrt(int n) {
        int i=0,j=n;
        int result=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(mid*mid<=n){
                result=mid;
                 i=mid+1;
                
            }
            else
            j=mid-1;
       
        }
        return result;
    
        
    }
}
