class Cricketer{
    static String country="india";
  // int runs;int avg;
    /*  final String country="india";
    int runs;int avg;*/

      // static String country="india";
      //  final static String country="india";
      // int runs;int avg; 
    //   static greet sabke liye hai same
      static void greet(){
        System.out.println("iiii");

    }
    

}



public class oops11 {
    public static void main(String[] args) {
        Cricketer c1=new Cricketer();
         Cricketer c2=new Cricketer();
      //  c1.country="nz";//finalstaic  pr error ayenga;
        c2.country="aus";//static pr error nahi ayenga 

         System.out.println(c2.country);
         c2.greet();

    }

    
}
