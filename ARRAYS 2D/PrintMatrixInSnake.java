public class PrintMatrixInSnake {
    public static void main(String[] args) {
         int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        //  rowwisepattern
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i%2==0){
                System.out.print(arr[i][j]+" ");
            }
            
                else{
                    System.out.print(arr[i][arr[0].length-j-1]+" ");
                   
                }

            }
           System.out.println(); 
        }
System.out.println();
        // columnwise snake pattern


         for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                if(j%2==0){
                System.out.print(arr[i][j]+" ");
            }
            
                else{
                    System.out.print(arr[arr.length-i-1][j]+" ");
                   
                }

            }
           System.out.println(); 
        }
    }
}
