import java.util.Stack;
import java.util.ArrayList;
class Node{
    Node left;
     Node right;
     int val;
     Node(int val){
        this.val=val;
     }
 }
 
 public class IN_OrderTraversal  {
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
           
          
           ArrayList<Integer>ans=  preorder(a);
           System.out.println(ans+" ");
    
      
    }
    public static  ArrayList<Integer>  preorder (Node root){

      Stack<Node> st=new Stack<>();
            ArrayList<Integer>ans=new ArrayList<>();
            
            Node current=root;
            while(st.size()>0||current!=null){
               if(current!=null){
                  if(current.left!=null){
                     st.push(current);
                     current=current.left;

                  }
                  else{
                     ans.add(current.val);
                     current=current.right;
                  }

               }
               else{
                  Node top=st.pop();
                  ans.add(top.val);
                  current=top.right;
               }
        

            } 

       return ans; 
    }

}   












