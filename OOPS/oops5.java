public class oops5 {//ultimate easy code hai;polymorphism;
    public static class Dog{
        void spark(){
            System.out.println("bahau");
        }

        

    }
      public static class Cat{
            void spark(){
            System.out.println("mau");
        }

        
    }
      public static class Lion{
            void spark(){
            System.out.println("ooooy");
        }
        
    }
       public static class human{
            void spark(){
            System.out.println("kare");
        }
        
    }
    public static void main(String[] args) {
        human s1=new human();
        Lion s2=new Lion();
         Dog s3=new Dog();
         Cat s4=new Cat();
         s1.spark();//ek naam alag-alag kam;
         s2.spark();
         s3.spark();
         s4.spark();
    }
    
       
      
    }
    


    


    


    


    

