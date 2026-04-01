public class friendPairing { public static void main(String[] args) {
    System.out.println(friend(3));
    
}
public static int  friend(int n) {
    if(n==1||n==2){
        return n;
    }
   int  f1=friend(n-1);
   int f2=friend(n-2);
   int pair=(n-1)*f2;
   int totalways=f1+pair;
   return totalways;
    
}
    
}
