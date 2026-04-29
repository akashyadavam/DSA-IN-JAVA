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
 
 
 public class PostOrderTraversal{
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
           
          
           ArrayList<Integer>ans=  postorder(a);
           System.out.println(ans+" ");
    
      
    }
    public static  ArrayList<Integer>  postorder(Node root){

      Stack<Node> st=new Stack<>();
       Stack<Node> st1=new Stack<>();
            ArrayList<Integer>ans=new ArrayList<>();
            st.push(root);
            while(st.size()>0){

                Node top=st.pop();
                  st1.push(top);
                // ans.add(top.val);
                 if(top.left!=null)st.push(top.left);
                  if(top.right!=null)st.push(top.right);

            }
           
            while(st1.size()>0){
                Node a=st1.pop();
                ans.add(a.val);
            }
               
       return ans;
    }

}   



//reverse preorder ka reverse ka post order hai;




