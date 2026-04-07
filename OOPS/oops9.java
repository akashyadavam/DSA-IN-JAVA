public class oops9 {
    public static void main(String[] args) {
        Car c1=new Car(3,4,"kia");
         Car c2=new Car(2,6,"ford");
        
         c1.print();
         c2.length=100;
         
         c2.print();
         Car c3=new Car();//hmne parameter wala constructor banaya hai isliye yah chal nahi raha hai;
         //iske liye by default wala bana paadenga

       c3.length=10;
       c3.print();
    }
    
}
class Car{//class ke andara method function sara kam hota haoiu;
    int seat;
    int length;
    String name;
     Car(){//by default for c3 b3ecause error de raha hai ise banaye hai;

    }

   

Car(int seat,int y,String z){//ye constructor banaya ;isi ke vajah se error a raha tha c3 wale mein
    this.seat=seat;//this vah hota hai jis object ne call lagaya hai;
    length=y;
    name=z;
}
void print(){
    System.out.println(seat+" "+length+" "+name);
}
}

