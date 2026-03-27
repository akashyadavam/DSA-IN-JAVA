public class array2 {
    public static void main(String[] args) {
        int n[]={1,2,3};
        int q=10;
        change(n,q);//calling fn ko batana pdta hai array n change honga;
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);


        }

        System.out.println(q);//PASS BY VALUE;   
    }
    // PASSING ARRAY AS ARGUMENT  BY REFERENCE 
    public static void change(int[] n,int q) {
        q=11;
        for(int i=0;i<n.length;i++){
            n[i]+=1;

        }
        
    }
}
