
import java.util.*;

public class KthSmallestInteger {
    public static void main(String[] args) {
        
       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       int arr[]={7,10,4,3,20,15};
       int k=3;
       for(int ele:arr){
        pq.add(ele);
        if(pq.size()>k) pq.remove();
       }
       System.out.println(pq.peek());
          

    }
    
}
