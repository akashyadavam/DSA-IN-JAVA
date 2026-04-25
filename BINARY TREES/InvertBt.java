class Node{
    Node left;
     Node right;
     int val;
     Node(int val){
        this.val=val;
     }
 }


public class InvertBt {
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
              display(a);
              System.out.println();
              invert(a);
              display(a);
              System.out.println();
    }
    public static void invert(Node root) {
        if(root==null) return ;
        Node t=root.left;
        root.left=root.right;
        root.right=t;
        invert(root.left);
        invert(root.right);

        
    }
     private  static void display(Node root){ 
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);//left ki sari value la denga
        display(root.right);//rigth ki sari val la dunga 


    }
    
}
