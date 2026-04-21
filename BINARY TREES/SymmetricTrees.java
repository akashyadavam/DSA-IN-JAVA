 class Node{
    Node left;
     Node right;
     int val;
     Node(int val){
        this.val=val;
     }
 }
 
 
 public class SymmetricTrees {
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(5);
       
        Node c=new Node(5);
        Node d=new Node(2);
        Node e=new Node(2);
        a.left=b;a.right=c;
        c.right=e;b.left=d;
        mirror(a.left);
          System.out.println(isIdentical(a.left, a.right)); 
        



       
                
             
    }
    private static void mirror(Node root){
       
         if(root==null) return ;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
        
    }
  public  static boolean isIdentical(Node p, Node q) {
        // code here
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.val!=q.val) return false;
        return isIdentical(p.left,q.left)&&isIdentical(p.right,q.right);
       
    }
    
}
