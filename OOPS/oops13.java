public class oops13 {
    static class Fraction{
        int num;int den;
        Fraction(int num,int den){
            this.num=num;
            this.den=den;
            simplyfy();
        }
        void simplyfy(){
            boolean isnegative=(num*den<0)?true:false;
            num=Math.abs(num);
            den=Math.abs(den);
            int gcd=hcf(num,den);
            num=num/gcd;
            den=den/gcd;
            if(isnegative) num=-num;
        }

            int hcf(int a,int b){
            if(a==0) return b;
            return hcf(b%a,a);}
        
        void print(){

            System.out.println(num+"/"+den);
        }
         void add(Fraction f){

           num=num*f.den+den*f.num;//ye already num den f1 ke hai kyoki call inhone lagwaya tha;change bhi f1 ke andar honga;
           den=den*f.den;
            simplyfy();//simplyfy karke karenge
        }
        void multiply(Fraction f){
            num=num*f.num;
            den=den*f.den;
             simplyfy();

        }
        void divide(Fraction f){
            num=num*f.den;//agar this nahi lagayenge to bhi ek hi bat hai lekin lagay karo
            den=den*f.num;
             simplyfy();

        }
    }
    public static void main(String[] args) {
        Fraction f1=new Fraction(-7,10);
         Fraction f2=new Fraction(-3,10 );
        f1.print();
         f2.print();
        f1.add(f2);
        f1.print();
     f1.multiply(f2);
        f1.print();

        
          f1.divide(f2);
          f1.print();


    }
    
}
