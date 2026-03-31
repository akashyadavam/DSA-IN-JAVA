import java.util.*;
public class demo {
    public static void main(String[] args) {
       ArrayList<Integer> a=new ArrayList<>();
       a.add(3); a.add(13); a.add(113);

       ArrayList<Integer> b=new ArrayList<>();
       b.add(5); b.add(15); b.add(114);
       ArrayList<Integer> c=new ArrayList<>();
       c.add(6); c.add(16); c.add(115);
       ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
       arr.add(a); arr.add(b); arr.add(c);
    //    System.out.print(arr);
       for(int i=0;i<arr.size();i++){
        for(int j=0;j<arr.get(i).size();j++){
            System.out.print(arr.get(i).get(j)+" ");
        }
       }
        
    }
}
