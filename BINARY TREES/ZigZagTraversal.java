import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Node {
    Node left;
    Node right;
    int val;

    Node(int val) {
        this.val = val;
    }
}

public class ZigZagTraversal {
    public static void main(String[] args) {
         Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node h = new Node(6);
        Node f = new Node(7);
        Node g = new Node(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        // e.right = h;levelorder(a);

          ArrayList<Integer> ans  = levelorder(a);
          System.out.print(ans);
    }
    private static ArrayList<Integer> levelorder(Node root) {
    Queue<Node> q = new LinkedList<>();
    q.add(root);
ArrayList<Integer> a=new ArrayList<>();
    boolean leftToRight = true;

    while (!q.isEmpty()) {
        int size = q.size();
        ArrayList<Integer> level = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            Node front = q.remove();

            if (leftToRight) {
                level.add(front.val);
            } else {
                level.add(0, front.val);
            }

            if (front.left != null) q.add(front.left);
            if (front.right != null) q.add(front.right);
        }

       
        for (int x : level) {
            System.out.print(x + " ");
        }
        System.out.println();

        leftToRight = !leftToRight;
    }
    return a;

   

}
}