
import java.util.ArrayList;
class Node{
    Node left;
     Node right;
     int val;
     Node(int val){
        this.val=val;
     }
 }
public class BoundaryTraversal {
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
              ArrayList<Integer>ans=new ArrayList<>();
              Node root=a;
              ans.add(root.val);
             leftbr(root.left,ans);
        leaf(root,ans);
        rightbr(root.right,ans);
         System.out.print(ans+" ");
    }
     public static void leftbr(Node root,ArrayList<Integer> ans){
         if(root==null) return;
         if(root.left==null &&root.right ==null) return;
         ans.add(root.val);
         if(root.left!=null) leftbr(root.left,ans);
         else leftbr(root.right,ans);
         
     }
     public static void leaf(Node root,ArrayList<Integer> ans){
         if(root==null) return;
         if(root.left==null &&root.right ==null) ans.add(root.val);
         leaf(root.left,ans);
         leaf(root.right,ans);
         
         
     }
    public static void   rightbr (Node root,ArrayList<Integer> ans){
         if(root==null) return;
         if(root.left==null &&root.right ==null) return;
         if(root.right!=null) rightbr(root.right,ans);
         else rightbr(root.left,ans);
         ans.add(root.val);
         
         
        
        
    }
  
}


//   maethod 2 ArrayList<Integer> ans = new ArrayList<>();
//         if (root == null) return ans;

//         ans.add(root.data);

//         leftbr(root.left, ans);

//         leaf(root.left, ans);
//         leaf(root.right, ans);

//         rightbr(root.right, ans);

//         return ans;
//     }

//     public static void leftbr(Node root, ArrayList<Integer> ans) {
//         if (root == null) return;

//         if (root.left == null && root.right == null) return;

//         ans.add(root.data);

//         if (root.left != null)
//             leftbr(root.left, ans);
//         else
//             leftbr(root.right, ans);
//     }

//     public static void leaf(Node root, ArrayList<Integer> ans) {
//         if (root == null) return;

//         if (root.left == null && root.right == null) {
//             ans.add(root.data);
//             return;
//         }

//         leaf(root.left, ans);
//         leaf(root.right, ans);
//     }

//     public static void rightbr(Node root, ArrayList<Integer> ans) {
//         if (root == null) return;

//         if (root.left == null && root.right == null) return;

//         if (root.right != null)
//             rightbr(root.right, ans);
//         else
//             rightbr(root.left, ans);

//         ans.add(root.data);
//     }