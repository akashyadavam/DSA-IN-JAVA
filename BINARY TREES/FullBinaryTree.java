// import org.w3c.dom.Node;
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

public class FullBinaryTree {
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
        System.out.println(isFullTree(a));;
    }
    private static boolean isFullTree(Node node) {
      
        if(node==null) return true;
       
        
         if(node.left==null&&node.right==null) return true;
         if(node.left!=null&&node.right!=null){
        return isFullTree(node.left)&&isFullTree(node.right);}
        return false;
    }
    
}
