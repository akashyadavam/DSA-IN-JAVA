import java.util.Scanner;

public class Binarynumber {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
        printbinary(n,0," ");
    }
    public static void printbinary( int n,int lastplace,String str) {
        if(n==0){
            System.out.println(str);
            return ;
        }
        printbinary(n-1,0,str+"0");
        if(lastplace==0){
            printbinary(n, 1, str+"1");
        }
    }

    
        }