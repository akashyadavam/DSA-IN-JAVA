// package STACKS;
import java.util.*;

public class Infixevaluation {
    public static void main(String[] args) {
        String s="9-5+3*4/6";
        Stack<Integer>st=new Stack<>();
        Stack<Character>op=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int a=(int)ch;
            if(a>=48&&a<=57){
                st.push(a-48);
            }
            else if(op.size()==0)  op.push(ch);
            else{
                 if(ch=='+'||ch=='-'){
                    int x=st.pop();
                    int y=st.pop();
                    if(op.peek()=='+') st.push(y+x);
                    if(op.peek()=='-') st.push(y-x);
                    if(op.peek()=='*') st.push(y*x);
                    if(op.peek()=='/') st.push(y/x);
                    op.pop();
                    op.push(ch);
                 }
                 else{
                    if(op.peek()=='*'||op.peek()=='/'){
                    int x=st.pop();
                    int y=st.pop();
                    if(op.peek()=='*') st.push(y*x);
                    if(op.peek()=='/') st.push(y/x); 
                    op.pop();
                    op.push(ch);                 

                 }
                 else{
                    op.push(ch);
                 }


            }

        }
        
    }
      while(st.size()>1){
        int x=st.pop();
        int y=st.pop();
        if(op.peek()=='+') st.push(y+x);
        if(op.peek()=='-') st.push(y-x);
        if(op.peek()=='*') st.push(y*x);
        if(op.peek()=='/') st.push(y/x);
        op.pop();
      }
      System.out.println(st.peek());




}
}

