public class BuiltinMethods {
    public static void main(String[] args) {
        String s="Hharshita";
        System.out.println(s.length());
        System.out.println(s.contains("Hhat"));
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.startsWith("Hha"));
        System.out.println(s.endsWith("ita"));//remember  space bhi count hota hai string mein
       



String a="akash";
String b=" yadav";
a.concat(b);//string are immutable aese nahi honga

System.out.println(a);

System.out.println(a.concat(b));

String y=a+" yadv";
System.out.println(y);
y+='\n';//iske kam next line menas bad mein jo add karenge iske bad wah next line mein print honga menas y mein add 10 huwa uske sath 
y+=10;
System.out.println(y);
System.out.println("raghav"+10+20+(50+20));
System.out.println('a'+"kash");
System.out.println('a'+2+"yadav");


    }
    
}
