import java.util.Scanner;

public class powerofnumber {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int x=sc.nextInt();
        
      System.out.println(  print(n,x));;//here n power to int x
        
    }
    public static int print(int n,int x) {
        // if(x==1) return n;
        // return n*print(n,x-1);
        if(x==0) return 1;
        int call=print(n,x/2);//taki bar bar call na lage yhi pr value calculate kr liya sabka update hote jayenga
        if(x%2==0) return call*call;
        else  return n*call*call;




        
    }
    
}
