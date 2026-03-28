import java.util.ArrayList;

public class BinarySearch2 {
    public static void main(String[] args) {
       int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
      System.out.println(search1(arr,5));
     System.out.print(searchend(arr,5));
    }
    public static int search1(int[] arr,int target) {
        
            int i=0,j=arr.length-1,idx=-1;
        
        while(i<=j){
          int mid = i + (j - i) / 2;
        if(arr[mid]>target) {
            j=mid-1;
        }
        else if (arr[mid]<target){
            i=mid+1;
        }
        else{ 
           idx= mid;
            j=mid-1;
        }
        }
        return idx;
       
        
    }
    public static int searchend(int [] arr,int target) {
         int l=0,m=arr.length-1,indx=-1;
        
        while(l<=m){
           int mid = l + (m - l) / 2;
        if(arr[mid]>target) {
            m=mid-1;
        }
        else if (arr[mid]<target){
            l=mid+1;
        }
        else{ 
          
               indx=mid;
               l=mid+1;
           
            
        }
         
        
    }
  return indx;
        
    }
    
  
    }

