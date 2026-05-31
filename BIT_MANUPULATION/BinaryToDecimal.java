public class BinaryToDecimal {
    public static void main(String[] args) {
    //     int n=1000001;int a=1;int result=0;
    //     while(n!=0){
    //         result+=a*(n%10);
    //         a*=2;
    //         n/=10;

    //     }
    //     System.out.println(result);
    // }

    int n = 1000001;
int temp = n;
int count = 0;

while (temp != 0) {
    count++;
    temp /= 10;
}
int[] arr = new int[count];
int i = 0;
while (n != 0) {
    arr[i++] = n % 10;
    n /= 10;
}

int a = 1;
int result = 0;

for (i = 0; i < arr.length; i++) {
    result += a * arr[i];
    a *= 2;
}

System.out.println(result);


    
    }
    
}
