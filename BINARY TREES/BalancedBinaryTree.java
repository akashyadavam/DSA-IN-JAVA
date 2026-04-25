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

public class BalancedBinaryTree {
    public static void main(String[] args) {
         Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(2);
        Node d=new Node(-1);
        Node e=new Node(1);
        Node f=new Node(6);
        Node g=new Node(9);
              a.left=b;
              a.right=c;
              b.left=d;
              b.right=e;
              c.left=f;
              c.right=g;
            //   flag=true;
             System.out.println( balanced(a));
    }
    public static  boolean balanced(Node root){
        if(root==null) return true;
        int left=level(root.right);
        int right=level(root.left);
        if(Math.abs(left-right)>1) return false;
        return balanced(root.left)&&balanced(root.right);
    }
      private  static int level(Node root){
        if(root==null) return 0;
       return 1+Math.max(level(root.left),level(root.right));
    //  
    }
}
