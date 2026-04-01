import  java.util.*;
public class decreasingorderofNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        print(n);
    }
    public static void print(int x) {
        if(x==0) return;
        System.out.print(x+" ");
        print(x-1);
        
    }
    
}

