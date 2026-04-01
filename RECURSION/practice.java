public class practice {
      public static void main(String[] args) {
       dec(5);
      }
//    static int pow(int a,int b){
//         if(b==0) return a;
//         if(b%2==0) return pow(a,b/2)*pow(a,b/2);
//          return a*pow(a,b/2);
       
       
// }
static void  dec(int n){
    if(n==0) return  ;
    System.out.println(n);
    dec(n-1);
   
    System.out.println(n);
} 
}
