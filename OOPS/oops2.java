public class oops2 {
    public static void main(String[] args) {
        Student s1=new Student();//YE S1 DATA TYPE KA NAM HAI;
        s1.name="akash";
        s1.age=19;
        s1.location="jaunpur";
      //  System.out.println(s1.name+" "+s1.age+" "+s1.location);
           Student s2=new Student();//YE S1 DATA TYPE KA NAM HAI;
        s2.name="DON";
        s2.age=20;
        s2.location="AJOSHI";
       // System.out.println(s2.name+" "+s2.age+" "+s2.location);
       s1.print();//yaha se call lagaya fn bankar;//passing object to method
       s2.print();
    }
    
    }
    

class Student{//YE EK DATATYPE BANAYA APNA CLASS BANAYA ANDAR USAKE PROPERTIES HAI;class ka first capital letter hona chahiye ;
    String name;//class ko main fn ke bahar likhne se hamesh use kr sakte ho
    int age;
    String location;
    void print(){//class ke andar fn/method banaya ye s1,auR EKk bar s2 ke sari data le lenge
        System.out.println(name+" "+age+" "+location);

    }
}

