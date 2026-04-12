package STACKS;

import java.util.Stack;

public class PushElementAtBUTTOM {
    public static void main(String[] args) {
        
    

     Stack<Integer> st=new Stack();
        st.push(3);//buttom
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);//top
        System.out.println(st);//intial


        pushatbottom(st,50);
        System.out.println(st);
    
    }
    static void pushatbottom( Stack<Integer> st,int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top=st.pop();
        pushatbottom(st,ele);
        st.push(top);


}}
