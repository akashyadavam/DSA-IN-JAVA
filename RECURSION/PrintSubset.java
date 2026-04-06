import java.util.ArrayList;
import java.util.List;

public class PrintSubset {
    public static void main(String[] args) {
        String s="abc";
        List<String>a1=new ArrayList<>();
        Subset("",s,0,a1);
        System.out.println(a1);
    }
    public static void Subset(String ans, String s,int idx,List<String>a1) {
        if(idx==s.length()){
            // System.out.println(ans+" ");
            a1.add(ans);
            return;
            
        }
        char ch=s.charAt(idx);
         Subset(ans+ch, s, idx+1,a1);//pick
        Subset(ans, s, idx+1,a1);//skip
      
    }
    
}
