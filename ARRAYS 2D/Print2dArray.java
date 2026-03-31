public class Print2dArray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
        // hERE is transport of matrix;
             for(int j=0;j<arr.length;j++){
            for(int i=0;i<arr.length;i++){
                
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
       System.out.println();



       
       //reverse of row elemnt
       
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][arr[0].length-j-1]+" ");

            }
            System.out.println();
        }




    }
           
        }



