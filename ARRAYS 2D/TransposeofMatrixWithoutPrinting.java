public class TransposeofMatrixWithoutPrinting{
    public static void main(String[] args) {
        //only happen in square matrix;
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         int temp=arr[i][j];
        //         arr[i][j]=arr[j][i];
        //         arr[j][i]=temp;//double swapping here happen;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                 int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;//single time  swapping here happen; in form of upper traingular matrix;

            }
           
        }

            System.out.println();
           
            print(arr);
        }
       



       
    
     static void print(int[][] arr) {
      for(int[] a : arr) {      // Har row ke liye ek row 1d array hai uthenga jayenga a array ke anda 
    for(int ele : a) {    // Row ke har element ke liye hai sab element ele ke andar store ek row ke
        System.out.print(ele + " ");
    }

            System.out.println();
        }

}
}

