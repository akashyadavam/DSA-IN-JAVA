// import java.lang.reflect.Array;
import java.util.*;

public class MostFrequent2 {
    public static void main(String[] args) {
           String s="character";
           char arr[] =s.toCharArray();
          Arrays.sort(arr);
          int j=0,i=0; int maxfreq=-1;
          int n=s.length();
        char ans=s.charAt(0);
        while(j<n){
            if(arr[i]==arr[j]){
                j++;
            }
            else{
                int freq=j-i;
                if(freq>maxfreq){
                    maxfreq=freq;
                    ans=arr[i];

                }
                i=j;
            }
        }
        // check for last character kyoki agar repet hote a rha hai to wah loop se bahar nikal aya to calculate karon
              int freq=j-i;
                if(freq>maxfreq){
                    maxfreq=freq;
                    ans=arr[i];
        }
        

        System.out.println(ans);

    }
  
}
