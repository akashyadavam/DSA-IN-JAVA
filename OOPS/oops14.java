import java.util.Arrays;

public class oops14 {
    public static class Student {
        String name;
        int rollno;
        int []marks;
       // Student(int s){//constructor ke andar array ka size diya ;
          //  marks=new int[s];
          Student(int []s){
        //    marks=s;
            marks=Arrays.copyOf(s,s.length);//ab deep copy kuch bhi changae kar lo no fark on arr
          }
        
        
        
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        
        //Student s1=new Student(4);
        Student s1=new Student(arr);
        //
        // s1.marks[0]=40;//ab deep copy bana hai ;
         s1.marks[0]=40;//SHALLOW COPY BANATI HAI;
        System.out.println(arr[0]);
      /*   s1.marks[0]=0;
        s1.marks[1]=1;
        s1.marks[2]=2;
        s1.marks[3]=3;
        s1.print();*/
    }
    
}
