package STACKS;

import java.util.Stack;

public class NextGreter2 {
    public static void main(String[] args) {
        int arr[] = {1, 8, 3, 5, 2, 1, 6, 4};
        int nge[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + nge[i]);
        }
    }
}
 