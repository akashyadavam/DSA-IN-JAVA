public class oops4 {
     public static void main(String[] args) {
        // students s1=new students();ye likhne se default constructor chalta hai jo dikhta nahi h
        students s2=new students("akash");
        students s3=new students(123);
        students s1=new students();
       
        
        
    }
    
}
class students{
    String  name;
    int rollno;
    students(String name){
       
        System.out.println(name);
    }
     students(int a){
       
        System.out.println(a);
    
}
 students(){
       
        System.out.println("yadav");
 }
}
