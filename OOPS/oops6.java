public class oops6 {//getter setter for private attributes;
    
    public static void main(String[] args) {
        Student s1=new Student();
        // System.out.println(s1.name); null denga ans mein
        s1.p();//s1.print pr private wala chal nahinrha hai s1.p karke ek function banwakar print karayenge
        // System.out.println(s1.name); ye mil jayenga but roll no nahi mil payenga;
        s1.cgpa=9;
        s1.name="akki";
        System.out.println(s1.getrollno());
        s1.setrollno(45);
                 
                      System.out.println(s1.getrollno());

    //    error ayega s1.rollno=67;
    }
}

class Student{
    int cgpa;
    private int rollno=12;
    String name;//null
    
   private void print(){//ye by defULT PUBLIC HOTA HAIN AGAR PRIVATE KR DIYA TO PRIINT NAHI HONGA TAB NEW FN BNA LENA'
   
        System.out.println(cgpa+" "+name+" "+rollno);//roll no print nahi kara sakte hain;by default hi print honga 
    }
     public void p(){//ye by defULT PUBLIC HOTA HAIN AGAR PRIVATE KR DIYA TO PRIINT NAHI HONGA TAB NEW FN BNA LENA'
    System.out.println(rollno);
    rollno=13;
      print();//roll no print nahi kara sakte hain;by default hi print honga //ab private wala fn chalega
    }
    int getrollno(){
         return rollno;

    }
    void setrollno(int x){//ye recieve karega ek roll no apne roll no mein vah roll no dedenga
        this.rollno=x;
    }
}