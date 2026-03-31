public class DiadonalSumofSquareMatrix {
    public static void main(String[] args) {
          int arr[][]={{1,2,3},
                    {5,6,7,},
                    {9,10,11,}};
                     int sumtotal=  diagonalsum(arr);
                      System.out.println(sumtotal);
                   
    
    
}
public static int diagonalsum(int[][]arr) {
    int n=arr.length;

    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i][i];
        if(i!=n-1-i){//secondary diagonal ka sum ye hain boss
            sum+=arr[i][n-1-i];
        }

    }
    return sum;
    
    }
}
