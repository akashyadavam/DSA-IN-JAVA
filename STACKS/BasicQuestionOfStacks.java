package STACKS;
import java.util.Stack;
public class BasicQuestionOfStacks {
        public static void main(String[] args) {
        Stack<Integer> st=new Stack();
         Stack<Integer> st2=new Stack();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        System.out.println(st.size());
        while(st.size()>0){
            int s=st.pop();
            st2.push(s);//yaha ulta store;

        }
         System.out.println(st2);
        while(st2.size()>0){
            
            st.push(st2.pop());
        }
         System.out.println(st);


         //get index 2
         // 
         int indx=2;
         while(st.size()>indx+1){
            st2.push(st.pop());

         }
         System.out.println(st.peek());
         System.out.println(st);

          while(st2.size()>0){
            
            st.push(st2.pop());
        }
         System.out.println(st);



         //add karenge index 2 par 5
          while(st.size()>indx){
            st2.push(st.pop());

         }

         st.push(5);
         System.out.println(st);

          while(st2.size()>0){
            
            st.push(st2.pop());
        }
         System.out.println(st);


         //remove karenge index 2 par jo 5 hai

          while(st.size()>indx+1){
            st2.push(st.pop());

         }

         st.pop();
         System.out.println(st);

          while(st2.size()>0){
            
            st.push(st2.pop());
        }
         System.out.println(st);
    }  
}
//all operatin in o(1);