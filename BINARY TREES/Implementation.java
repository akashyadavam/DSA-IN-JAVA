class Node{
    Node left;
     Node right;
     int val;
     Node(int val){
        this.val=val;
     }
 }
public class Implementation {
    // 3
    public static void main(String[] args) {//LOGN TRAVERSE KA TC IN BT
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
            //   size(a);
              System.out.println(size(a));
             System.out.println( sum(a));
             System.out.println(multiply(a));
             System.out.println(max(a));
             System.out.println(min(a));
            System.out.println(level(a));
             preorder(a);System.out.println();
              postorder(a);System.out.println();
              inorder(a);
    }
    private  static void display(Node root){ 
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);//left ki sari value la denga
        display(root.right);//rigth ki sari val la dunga 


    }
      private  static int size(Node root){
    //     if(root==null) return 0;
    //    return 1+size(root.left)+size(root.right);
    return  (root==null)?0:1+size(root.left)+size(root.right);
        

    }
     private  static int sum(Node root){
        if(root==null) return 0;
        // if(root.left==null&&root.rigth==null) return 1
       return root.val+sum(root.left)+sum(root.right);
    //    
        

    }
     private  static int multiply(Node root){
        if(root==null) return 1;
       return root.val*multiply(root.left)*multiply(root.right);
    //    
        

    }
      private  static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left),max(root.right)));
    //    
        

    }
    private  static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left),min(root.right)));
    //    
        

    }
     private  static int level(Node root){
        if(root==null) return 0;
       return 1+Math.max(level(root.left),level(root.right));
    //    
        

    }
      private  static void preorder(Node root){ 
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);


    }
    private  static void postorder(Node root){ 
        if(root==null) return;
       
        postorder(root.left);
        postorder(root.right); System.out.print(root.val+" ");


    }
    private  static void inorder(Node root){ 
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
      
        inorder(root.right);


    }
    
}
