// package BIT_MANUPULATION;

public class DecimalToBinary {
    // public static void main(String[] args) {
    //     String a="";
    //     int n=65;
    //      StringBuilder sb = new StringBuilder();
    //     convert(n, sb);

    //     System.out.println(sb); // 1000001
    // }

    // static void convert(int n, StringBuilder sb) {
    //     if (n == 0) {
    //         return;
    //     }

    //     convert(n / 2, sb);
    //     sb.append(n % 2);
    // }
    

    public static void main(String[] args) {
        // int n=65;
        // String ans="";
        // while(n!=0){
        //     int a=n%2;
        //     String str = Integer.toString(a);
        //     ans+=str;
        //     n/=2;
        // }
        // int num = Integer.parseInt(ans);int a=0;
        // while(num!=0){
        //     a=(a*10+num%10);
        //     num/=10;

        // }
        // System.out.println(a);


//         int n = 65;
// StringBuilder sb = new StringBuilder();

// while (n != 0) {
//     sb.append(n % 2);
//     n /= 2;
// }

// System.out.println(sb.reverse());

//     }
        int n = 65;
String sb = "";

while (n != 0) {
    sb=n%2+sb;
   
    n /= 2;
}

System.out.println(sb);

    }


}
