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

public class RigthViewOfBt {
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
        ArrayList<Integer>ans=new ArrayList<>();
        view(a,0,ans);
        System.out.print(ans+" ");
        
    }
     private static  void view(Node root,int level,ArrayList<Integer>ans){ 
        if(root==null) return;
        if(level>=ans.size()) ans.add(root.val);
        else ans.set(level,root.val);
         view(root.left,level+1,ans);
        view(root.right,level+1,ans);
       
    }
    
}
