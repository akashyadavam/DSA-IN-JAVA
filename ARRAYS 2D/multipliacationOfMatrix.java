import java.util.ArrayList;

public class multipliacationOfMatrix {
 static void print(int [][]a,int [][]b,int [][]c){
    int n=a.length;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                c[i][j]+=a[i][k]*b[k][j];
            }
        }
    }


 }



    public static void main(String[] args) {
         int a[][]={{1,2},{1,2}};
         int [][]b={{1,2},{1,2}};
         int [][]c=new int [2][2];
         print(a,b,c);
         for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
         }
          
        
        
    }
        
    

    

