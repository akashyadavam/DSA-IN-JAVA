import java.util.ArrayList;

class Node{
    Node left;
     Node right;
     int val;
     Node(int val){
        this.val=val;
     }
 }


public class BinaryTreesParh {
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
              
              ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
               dfs(a,new ArrayList<>(),ans);
               System.out.println(ans);
    }
   private static void dfs(Node root,ArrayList<Integer>arr, ArrayList<ArrayList<Integer>> ans){
         if(root==null) return;
          arr.add(root.val);
         if(root.left==null&&root.right==null){
             ArrayList<Integer>list=new ArrayList<>();
            //  arr.add(root.data);
             list.addAll(arr);
             ans.add(list);
            //   arr.remove(arr.size()-1);
            //   return;
             
         }
        //  arr.add(root.data);
         dfs(root.left,arr,ans);
         dfs(root.right,arr,ans);
         arr.remove(arr.size()-1);//backtracking
        
     }

}
