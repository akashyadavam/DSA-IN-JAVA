package HashMap;

import java.util.HashMap;

public class Count_Pairs {
    public static void main(String[] args) {
          HashMap<Integer,Integer>map=new HashMap<>();
          int arr[]={1, 4, 1, 4, 5};
          int k=3;
          for(int ele:arr){
            
            if(map.containsKey(ele)){
                int freq=map.get(ele);
                map.put(ele,freq+1);

            }
             else{
             map.put(ele,1);
            }
          }
          int pairs=0;
          for(int ele:map.keySet()){
          int rem1=k+ele;
           int rem2=ele-k;
           if(map.containsKey(rem1)){
            pairs+=(map.get(rem1))*map.get(ele);
           }
            if(map.containsKey(rem2)){
            pairs+=(map.get(rem2))*map.get(ele);
           }

    }
    pairs/=2;
    System.out.println(pairs);
}  
}
