public class oops15 {
    public static void main(String[] args) {
        // Cricketer c1=new Cricketer();
        // c1.print();
        // c1.print();
        System.out.println(Cricketer.n);
        Cricketer.print();//static wali chize bina object banye bhi ho jati hain
    }

    
}
class  Cricketer{
    int height=10;
    // String name="AK";
    static String  n="a";
    // void print(){
    //     System.out.println(height+","+name);
    // }
    //   static void print(){
    //     System.out.println(height+","+name);//ab error ayenga kyoki heiht name sattic nahi hai
    // }
       static void print(){
        System.out.println("hello");
    }
}
