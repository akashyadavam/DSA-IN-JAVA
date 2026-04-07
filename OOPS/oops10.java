public class oops10 {
    public static void main(String[] args) { 
        Pokemon p1=new Pokemon("poke",4);
        p1.print();



    }

        static class Pokemon{
            String types;
            int power;
            Pokemon(String types,int power){//setter;
         // ye error de raha hai;    //  power=power;
               // name=name; same variable constructor mein aaceptor kr rahe hai jo class mein hai this ka used karo usedless faltu ka kaaam
            //    pkemenon ka type  p1 ke equla ke liye this ka used karenge jo define karenga ki p1
                  this.power=power;
                this.types=types;
            }
            void print(){
                System.out.println(types+" "+power);
            }
        }
    }
    
    

