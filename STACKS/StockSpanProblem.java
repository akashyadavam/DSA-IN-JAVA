package STACKS;

import java.util.Stack;

class Pair {
    int val;
    int index;

    Pair(int val, int index) {
        this.val = val;
        this.index = index;
    }
}

public class StockSpanProblem {
    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        int ans[] = new int[arr.length];

        Stack<Pair> st = new Stack<>();

        st.push(new Pair(arr[0], 0));
        ans[0] = 1;

        for (int i = 1; i < arr.length; i++) {

            while (!st.isEmpty() && arr[i] >= st.peek().val) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek().index;
            }

            st.push(new Pair(arr[i], i));
        }

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}