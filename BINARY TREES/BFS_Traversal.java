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

public class BFS_Traversal {
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
        e.right = h;

        levelorder(a);
    }

    private static void levelorder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);//yha root jo node hai wah pahle se object hai new krne ki jrurat nhai agar kuch value bhjena ho tab new node karenge wah jayenga value kyoki root node pahle se existing use bhej denge

        while (!q.isEmpty()) {
            Node front = q.remove();
            System.out.print(front.val + " ");

            if (front.left != null) q.add(front.left);
            if (front.right != null) q.add(front.right);
        }
    }
}


