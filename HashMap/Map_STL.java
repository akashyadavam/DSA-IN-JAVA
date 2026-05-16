package HashMap;

import java.util.HashMap;

public class Map_STL {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("akash", 21);
         map.put("iyer", 212);
          map.put("akassh", 201);
           map.put("akasssh", 2211);
           System.out.print(map+" ");
          System.out.println( map.remove("akash"));

          System.out.println(map.get("iyer"));
          

         System.out.print(map+" "+map.size());System.out.println(); 
           map.put("iyer",32 ); System.out.print(map+" "+map.size());
           System.out.println();
           for(String key:map.keySet()){
            System.out.println((key));
           }

        
    }
}
    

