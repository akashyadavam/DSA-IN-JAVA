package STACKS;

import java.util.Stack;

public class Stock2 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        int ans[] = new int[arr.length];
        st.push(0);
        ans[0]=1;
         
   for (int i = 1; i < arr.length; i++) {
    while(st.size()>0&&arr[i]>=arr[st.peek()]) st.pop();
    if(st.size()==0) ans[i]=i+1;
    else ans[i]=i-st.peek();
    st.push(i);
 
        }
         for (int ele : ans) {
            System.out.print(ele + " ");
        }

    }
    
}
