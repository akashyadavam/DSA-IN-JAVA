// package STACKS;

import java.util.Stack;

public class PrefixExpression {
    public static void main(String[] args) {
        String s="9-(5+3)*4/6";
        Stack<String>st=new Stack<>();
        Stack<Character>op=new Stack<>();
        for(int i=0;i<s.length();i++){  
            char ch=s.charAt(i);
            int a=(int)ch;
            if(a>=48&&a<=57){
                String ss=""+ch;
                st.push(ss);
            }
            else if(op.size()==0||ch=='('||op.peek()=='(')  op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                     String x=st.pop();
                    String y=st.pop();
                    char o=op.pop();
                    String t=o+y+x; 
                    st.push(t);  
                }
                op.pop();//hta diya bracket
            }
            else{
                 if(ch=='+'||ch=='-'){
                     String x=st.pop();
                    String y=st.pop();
                    char o=op.pop();
                    String t=o+y+x; 
                    st.push(t);  
                    op.push(ch);
                 }
                 else{
                    if(op.peek()=='*'||op.peek()=='/'){
                      String x=st.pop();
                    String y=st.pop();
                    char o=op.pop();
                    String t=o+y+x; 
                    st.push(t);  
                    op.push(ch);                 
                 }
                 else{
                    op.push(ch);
                 }
            }
        }  
    }
      while(st.size()>1){
        String x=st.pop();
         String y=st.pop();
         char o=op.pop();
          String t=o+y+x;  
         st.push(t);  
      }
      String prefix=st.pop();
      System.out.println(prefix);
    }
}
