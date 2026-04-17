package STACKS;

import java.util.Stack;

public class removeDuplicates {
    
    public static void main(String[] args) {
        String s=  "abbaca";
         Stack<Character> st=new Stack();
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.size()==0) st.push(ch);
            else if(ch==st.peek()) st.pop();
            else st.push(ch);
         } 
         StringBuilder result = new StringBuilder();
          for (char c : st) {
            result.append(c);
        }
         s=result.toString();
         System.out.println(s);
        
       
        

    }
}
