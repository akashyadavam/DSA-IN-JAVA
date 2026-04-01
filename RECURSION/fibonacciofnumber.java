
    // Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class fibonacciofnumber {
   
   

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(sumoffibonacci(n));
   }

   public static int sumoffibonacci(int n) {
      if (n==0||n==1) {
        return n;
    }
         int fb1 = sumoffibonacci(n-1);
         int fb2 = sumoffibonacci(n-2);
         int sum = fb1+fb2;
         return sum;
      } 
      }
   



