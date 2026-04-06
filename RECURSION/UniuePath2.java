public class UniuePath2 {
    public static void main(String[] args) {
       System.out.println( uniquepath(3,3));;
    }
    static int uniquepath(int m,int n){
        return solve(0,0,m-1,n-1);
    }
     static int solve(int fr,int fc,int lr,int lc){
        if(fr==lr||lc==fc) return 1;
        if(fr>lr||fc>lc) return 0;
        int rigth=solve( fr,fc+1, lr,lc);
        int down=solve( fr+1, fc,lr, lc);
        return rigth+down;
     }
    
}
