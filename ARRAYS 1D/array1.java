public class array1 {
    public static void main(String[] args) {
        int marks[]=new int[100];
        marks[0]=10;//input bhi le sakte hain 
        marks[1]=12;
        marks[2]=21;
        System.out.println("physics marks="+marks[0]+" chemistry marks="+marks[1]+" maths marks="+marks[2]);
        marks[1]=34;
        System.out.println(marks[1]);
        System.out.println(marks.length);
    }
    
}
