import java.util.Scanner;

public class GCDofTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(hcf(a,b));;

    }
    static int hcf(int a,int b){
        if(a==0) return b;
        return hcf(b%a,a);
        
    }
}
