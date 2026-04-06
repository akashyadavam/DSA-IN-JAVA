import java.util.ArrayList;

public class StringBasicMore {
    public static void main(String[] args) {
        String s="akash";
        change(s);
        System.out.println(s);
        String a[]={"ak","as","h","yad","av"};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"");
        }
        System.out.println();
         change3(a);
          for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"");
        }
        ArrayList<String> ans=new  ArrayList<>();
        ans.add("ak");
        ans.add("as");
        ans.add("h");
        ans.add("yadav");
        System.out.println(ans);
        change2(ans);
        System.out.println(ans);
    }
     public static void change2( ArrayList<String> ans){
        ans.add(0, "am");
     }
      public static void change3( String []a){
        a[0]="naman";
        
     }

    public static void change(String s){
       s="lavish";
}
}
