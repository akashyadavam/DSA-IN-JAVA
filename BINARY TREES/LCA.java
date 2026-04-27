class Node{
    Node left;
     Node right;
     int val;
     Node(int val){
        this.val=val;
     }
 }


public class LCA {
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
    public static int lca(Node root,int x,int y) {
        if(root==null) return -1;
       if(root.val==x||root.val==y) return root.val;
       boolean left=search(root.left,x);
        boolean right=search(root.left,y);
        if(left && right) return lca(root.left,x,y);
        else if(!left && !right) return lca(root.right,x,y);
        else{
            return root.val;
        }
    }


  public  static boolean search(Node root,int x){
    if(root==null) return false;
    if(root.val==x) return true;


    return search(root.left,x)||search(root.right,x);
  }



        
    }
    

