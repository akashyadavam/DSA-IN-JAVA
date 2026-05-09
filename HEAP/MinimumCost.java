package HEAP;

import java.util.PriorityQueue;

public class MinimumCost {
    public static void main(String[] args) {
         PriorityQueue<Integer> pq=new PriorityQueue<>();
       int arr[]={4,2,7,6,9};int i=0;
      while(i<arr.length){
        pq.add(arr[i]);i++;
      }
    
   int cost=0;
   while(pq.size()!=1){
    int a=pq.remove();
    int b=pq.remove();
    cost+=(a+b);
    pq.add(a+b);

   }
   System.out.println(cost);

} 
}
