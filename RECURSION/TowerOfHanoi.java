public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }
    public static void hanoi(int n,char src,char helper,char dest) {
        if(n==0) return;
        hanoi(n-1,src,dest,helper);
         //largest from a to c;
        System.out.println(src+"->"+dest);
    //    n-1 disks from b to c via a
      hanoi(n-1,helper,dest,src);
    

        
    }
    


    
}
