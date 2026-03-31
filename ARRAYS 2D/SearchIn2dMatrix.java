public class SearchIn2dMatrix {
    
    public static void main(String[] args) {
         int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
         System.out.println(search(arr,10));;
    }
    public static boolean search(int[][] arr,int target) {
         int m=arr.length;int n=arr[0].length;
    int i=0,j=n-1;
    while(j>=0&&i<=m-1){
        if(arr[i][j]>target) j--;
        else if(arr[i][j]<target) i++;
        else return true;
    }

return false;
}
    }
    

