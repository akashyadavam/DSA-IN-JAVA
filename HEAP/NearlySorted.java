package HEAP;

import java.util.Collections;
import java.util.PriorityQueue;

public class NearlySorted {
    public static void main(String[] args) {
         PriorityQueue<Integer> pq=new PriorityQueue<>();
       int arr[]={7,10,4,3,20,15};
       int k=3;int idx=0;
        for(int ele:arr){
        pq.add(ele);
        if(pq.size()>k) {
            int top=pq.remove();
            arr[idx++]=top;
        }

       }
       while(pq.size()!=0)  arr[idx++]=pq.remove();
       for(int ele:arr){
        System.out.print(ele+" ");
       }
    }
}
