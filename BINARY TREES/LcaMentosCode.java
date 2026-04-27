class Node{
    Node left;
     Node right;
     int val;
     Node(int val){
        this.val=val;
     }
 }

public class LcaMentosCode {
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
              System.out.println(lca(a,1,6));
    }
      public static Node lca(Node root,int x,int y) {
        if(root==null) return null;
        if(root.val==x||root.val==y) return root;
        Node l=lca(root.left, x, y);
        Node m=lca(root.right, x, y);
        if(l!=null && m!=null) return root;
        return (l==null)?m:l;//ye tab hi return honga jab left side dono na mile ; agar dono mile root  return aur agar do left side ho tab ye apne hisab se return honga 

    }
}
    

