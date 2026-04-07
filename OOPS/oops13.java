public class oops13 {
    static class Fraction{
        int num;int den;
        Fraction(int num,int den){
            this.num=num;
            this.den=den;
        }
        void print(){

            System.out.println(num+"/"+den);
        }
         void add(Fraction f){

           num=num*f.den+den*f.num;//ye already num den f1 ke hai kyoki call inhone lagwaya tha;change bhi f1 ke andar honga;
           den=den*f.den;
        }
        void multiply(Fraction f){
            num=num*f.num;
            den=den*f.den;

        }
        void divide(Fraction f){
            num=num*f.den;//agar this nahi lagayenge to bhi ek hi bat hai lekin lagay karo
            den=den*f.num;

        }
    }
    public static void main(String[] args) {
        Fraction f1=new Fraction(3,7 );
         Fraction f2=new Fraction(7,3 );
        f1.print();
         f2.print();
        // f1.add(f2);
        // f1.print();
       /*  f1.multiply(f2);
       f1.print();

         */
        /*  f1.divide(f2);
         f1.print();*/


    }
    
}
