import java.util.*; 
public class string1 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
      
      String name=sc.next();
        String name2=sc.next();//YAHA PAR INT KE JAGAH SSTRING HONGA USKE BAD JO NAAM DENA HO DO;
        String y=name+name2;
        print(y);
       
    
}
public static void print(String a) {
    int n=a.length();//yaad rakhana array nahi hai ye strings hai yaha par()ye lagana mat bhulna ;
    for(int i=0;i<n;i++){
        System.out.print(a.charAt(i)+" ");
    }
    System.out.println();
    
}

}
