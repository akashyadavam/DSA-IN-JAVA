package HEAP;
class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class IsBtMaxHeap { 
    static int s;
    public static void main(String[] args) {
        Node a = new Node(97);
Node b = new Node(46);
Node c = new Node(37);
Node d = new Node(12);
Node e = new Node(3);
Node f = new Node(7);
Node g = new Node(31);
Node h = new Node(2);
Node i = new Node(4);

a.left = b; 
a.right = c; 
b.left = d; 
b.right = e; 
c.left = f; 
c.right = g; 
e.left = h;
e.right = i;
s=size(a);
 if (iscbt(a,1)&&ismaxheap(a)){
    System.out.println("true");
 }
 else{
     System.out.println("trueee");
 }
    }
    public static boolean ismaxheap(Node root) {
        if(root==null) return true;
        int leftval=(root.left!=null)?root.left.data:Integer.MIN_VALUE ;
        int rightval=(root.right!=null)?root.right.data:Integer.MIN_VALUE;
        if(root.data<=leftval||root.data<=rightval) return false;

        return ismaxheap(root.left)&& ismaxheap(root.right);
        
    }
    private  static int size(Node root){
    return  (root==null)?0:1+size(root.left)+size(root.right);
    
}
 public static boolean  iscbt(Node root,int idx){
    if(root==null) return true;
    if(idx>s) return false;
    return iscbt(root.left,2*idx)&&
    iscbt(root.right,2*idx+1);
 }

}
