import java.util.Scanner;

public class oops1 {
    public static void main(String[] args) {
        Student s1=new Student();//YE S1 DATA TYPE KA NAM HAI;
        Scanner sc=new Scanner(System.in);
        s1.name="akash";
        // s1.age=19;
        s1.age=sc.nextInt();
        s1.location="jaunpur";
        System.out.println(s1.name+" "+s1.age+" "+s1.location);
           Student s2=new Student();//YE S1 DATA TYPE KA NAM HAI;
        s2.name="DON";
        s2.age=20;
        s2.location="AJOSHI";
        System.out.println(s2.name+" "+s2.age+" "+s2.location);
    }
    
    }
    

class Student{//YE EK DATATYPE BANAYA APNA CLASS BANAYA ANDAR USAKE PROPERTIES HAI;class ka first capital letter hona chahiye ;
    String name;
    int age;
    String location;
}
