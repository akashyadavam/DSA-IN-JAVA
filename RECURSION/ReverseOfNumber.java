public class ReverseOfNumber {
    public static void main(String[] args) {
        int n=123;
        System.out.println(print(123,0));;
    }
    static int print(int n,int ans){
        if(n==0) return ans;
         return print(n/10,ans*10+n%10);//logn time complexity
    }
}
