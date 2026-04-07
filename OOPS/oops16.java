public class oops16 {
    public static void main(String[] args) {
        Pokemon pikachu=new Pokemon();
        Legenderpokemon pika=new  Legenderpokemon();
        Legender  pi=new Legender();
    }
    
    
}
class Pokemon{
    int power;
    String name;
    // Pokemon(String type,int power){
    //     this.name=type;
    //     this.power=power;
    // }
    void print(){
        System.out.println(power+" "+name);
    }
}
class Legenderpokemon extends Pokemon{
    int wheels;

}
class Legender extends Pokemon{
    int row;

}
