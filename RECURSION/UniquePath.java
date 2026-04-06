public class UniquePath {
    public static void main(String[] args) {
       System.out.println( uniquepath(3,3));;
    }
     static int uniquepath(int m,int n) {
        if(m==1) return 1;
        if(n==1) return 1;
        return uniquepath(m-1, n)+uniquepath(m, n-1);

     }
    
}
