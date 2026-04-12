package STACKS;

import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        String s="{()}[]";
        System.out.println( isbalanced(s));


         }
         static boolean isbalanced(String s){
            Stack<Character> st=new  Stack<>();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='('||ch=='['||ch=='{') st.push(ch);
                else{//closing bracket
                    if(st.size()==0) return false;
                    char top=st.peek();//opening
                    if (samestyle(top,ch)) st.pop();
                    else return false;

                }
            }
            return (st.size()==0);//ye true false retun karega  ;
         }
         static boolean samestyle(char a,char b){
            if(a=='('&& b==')') return true;
            if(a=='['&& b==']') return true;
            if(a=='{'&& b=='}') return true;

            return false;
         }
    }
    

