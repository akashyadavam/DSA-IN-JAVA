public class oops25 {
    public static void main(String[] args) {
        // 'C' capital hona chahiye
        Calculator c1 = new Calculator(2, 3); 
        
        c1.add(4, 5);       // Do wala box chalega
        c1.add(4, 5, 6);    // Teen wala box chalega
    }
}
     class Calculator {
    int a;
    int b;

    // Sahi Constructor (No void, Name matches Class)
    // Calculator(int c, int d) {
    //     this.a = c;
    //     this.b = d;
    // }
    Calculator(int c, int d) {
        System.out.println(c+d);}
         Calculator(double g, double h) {//ab ye nahi chalega agr int int kar diye to compile error ho ajyenga method overlaoding nahi ayenga
            
        System.out.println(g*h);}

    

    // Pehla roop: Do numbers ka sum
    void add(int p, int q) {
        System.out.println("Sum: " + (p + q));
    }

    // Doosra roop: Teen numbers ka sum (Ab ye Polymorphism hai!)
    void add(int x, int y, int z) {
        System.out.println("Sum of 3: " + (x + y + z));
    }
}

    

    
