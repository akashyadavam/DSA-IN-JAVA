public class oops3 {//apan college
    public static void main(String[] args) {
        students s1=new students("AKASH");
        System.out.println(s1.name);
    }
    
}
class students{
    String  name;
    int rollno;
    students(String hoolo){//constructor
        this.name=hoolo;
        System.out.print(name);//pahke ye chala class s1 ka name hollo ke string ke equal hai
    }
}
