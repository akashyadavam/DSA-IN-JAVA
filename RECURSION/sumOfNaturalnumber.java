import java.util.Scanner;

public class sumOfNaturalnumber {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        System.out.println(sum(1,n));
    
}
public static int sum(int a,int x) {
    if(a==x) return x;
    return a+sum(a+1,x);
    
}
}
