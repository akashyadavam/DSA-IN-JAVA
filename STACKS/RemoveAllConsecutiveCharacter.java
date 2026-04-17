package STACKS;

import java.util.Stack;

public class RemoveAllConsecutiveCharacter {
     public static void main(String[] args) {
        String s=  "aabb";
           Stack<Character> st=new  Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                continue;
                
            }
            else{
                st.push(s.charAt(i));
            }
        }
            StringBuilder sb = new StringBuilder();
            while(st.size()>0){
                sb.append(st.pop());
            }
          s= sb.reverse().toString();
          System.out.println(s);
    
}}
