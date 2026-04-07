public class oops8 {
    
    public static void main(String[] args) {
        dog dobby=new dog();
        dobby.eat();
    }

    
}
class Animals{
    String colour;
    void eat(){
        System.out.println(this.colour);
        System.out.println("aeats");

    }
    void breathe(){
        System.out.println("breathe");
    }
}
class mammal extends Animals{
    int legs;

}
class dog extends mammal{//dog mmamal ke attribute aur mmanl animal ko dog animal ke  bus ek extra extend kra lo
    int legs;

}

    

