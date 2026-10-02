package STACKS;
import java.util.Stack;

public class practice {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        System.out.println(st);// b to top printing  
        reverse(st);
        System.out.println(st);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
          
    }
   static  void reverse( Stack<Integer> st){
    if(st.size()<1){
        return;
    }
    int top=st.pop();
    reverse(st);
    pushbuttom(st,top);

   }
  public static void  pushbuttom(Stack<Integer> st,int top){
   if(st.size()==0){
     st.push(top);
     return;
   }
    int topp=st.pop();
    pushbuttom(st, top);
    st.push(topp);

   }
    
}
