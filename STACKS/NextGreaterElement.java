package STACKS;

import java.util.ArrayList;
import java.util.Stack;

 
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={1,8,3,5,2,1,6,4};
        int nge[]=new int [arr.length];
         Stack<Integer> st=new  Stack<>();
         for(int i=arr.length-1;i>=0;i--){
           while(st.size()!=0&&arr[i]>=st.peek()) st.pop();
             if(st.size()==0) nge[i]=-1;
              else nge[i]=st.peek();
                st.push(arr[i]);
            }
         
    
    for(int ele:nge){
        System.out.println(ele+" ");

    }
    
}
}

