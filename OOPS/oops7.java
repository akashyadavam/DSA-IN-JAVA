public class oops7 {
    public static void main(String[] args) {
        Fish shark=new Fish();
         animals s=new animals();
        //  s.print();
        shark.eat();
    }

    
}
class animals{
    String colour;
//    void print(){
// System.out.println(colour);

//    }
    void eat(){
        System.out.println("eats");
        
    }
    void breathe(){
        System.out.println("breathe");
    }
}
class Fish extends animals{
   int fins;

}
