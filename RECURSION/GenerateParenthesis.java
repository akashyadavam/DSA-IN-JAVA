import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        String s="";
        List<String>list=new ArrayList<>();
        print(3,list,0,0,s);
        System.out.println(list);

    }
    public static void print(int n, List<String>list,int l,int r,String s) {
        if(r==n){ list.add(s) ;return;}//kyokilast mein right wala lag rah ahai isliye ye condition use kar rhae hain;
      if(l<n){
          print(3,list,l+1,0,s+"("); 
        
      }
      if(r<l)  print(3,list,l,r+1,s+")");
      


        
    }
    
}
