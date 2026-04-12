package STACKS;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseOfStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>();

         st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        System.out.println(st);
        // while(st.size()>0){
        //     ans.add(st.pop());
        // }
        // int i=0;
        // while(i<ans.size()){
        //     st.push(ans.get(i));
        //     i++;
        // }
        // System.out.println(st);


        //reverse stack recursively
        System.out.println(st);
        reverse(st);
        System.out.println(st);


    }
    static void reverse( Stack<Integer> st){
        if(st.size()<=1) return;
        int top=st.pop();
        reverse(st);
         pushatbottom(st,top);
    }
     static void pushatbottom( Stack<Integer> st,int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top=st.pop();
        pushatbottom(st,ele);
        st.push(top);


}
    
}
