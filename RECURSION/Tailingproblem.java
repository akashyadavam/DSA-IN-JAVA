import java.util.Scanner;

public class Tailingproblem { //please dry run on paper for better understanding;
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(tailingproblem(n));
    
}
public static int tailingproblem(int n) {
    if(n==0||n==1){
        return 1;
    }
    int vertical=tailingproblem(n-1);
    int horizontal=tailingproblem(n-2);
    int sum=vertical+horizontal;
    return sum;
    
}
    
}
