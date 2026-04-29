package STACKS;
import java.util.Stack;

public class BasicSTLofStacks {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        System.out.println(st.isEmpty());
        st.push("khushi");
        st.push("khu");
        st.push("khush");
        st.push("khushiii");
        System.out.println(st.size());
        st.pop();
        System.out.println(st+" " +st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());//it remove topmost elemnt then remove it;
        String s=st.pop();
        System.out.println(s);



    }
    
}
