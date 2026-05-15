import java.util.*;

class Student implements Comparable<Student> {

    String name;
    int rln;
    double cgpa;

    Student(String a, int b, double c) {
        name = a;
        rln = b;
        cgpa = c;
    }

    public int compareTo(Student s) {
return Double.compare( s.cgpa,this.cgpa);
    }
}

public class CustomComparator {

    public static void main(String[] args) {

        Student s1 = new Student("Anuj", 20, 8.0);
        Student s2 = new Student("Aditya", 21, 8.9);
        Student s3 = new Student("Gopi", 22, 9.5);
        Student s4 = new Student("Aman", 23, 8.2);

        Student[] arr = {s1, s2, s3, s4};

        Arrays.sort(arr);

       

        for(Student s : arr) {
            System.out.println(s.name + " " + s.cgpa);
        }
    }
}