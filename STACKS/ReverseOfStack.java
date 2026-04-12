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
        while(st.size()>0){
            ans.add(st.pop());
        }
        int i=0;
        while(i<ans.size()){
            st.push(ans.get(i));
            i++;
        }
        System.out.println(st);

    }
    
}
