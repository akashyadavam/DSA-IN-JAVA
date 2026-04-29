import java.util.ArrayList;

class Node{
    Node left;
     Node right;
     int data;
     Node(int data){
        this.data=data;
     }
 }

public class PrintTargetSumPath {
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
              ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
              ArrayList<Integer>arr=new ArrayList<>();
              dfs(a,arr,ans,6);
              System.out.println(ans+" ");




    
}
private static void  dfs(Node root, ArrayList<Integer>arr,  ArrayList<ArrayList<Integer>>ans,int sum){
    if(root==null) return;
    arr.add(root.data);
    if (sum-root.data==0){
      ArrayList<Integer>arr2=new ArrayList<>();
      arr2.addAll(arr);
      ans.add(arr2);

    }
    
     dfs(root.left,arr,ans,sum-root.data);
      dfs(root.right,arr,ans,sum-root.data);
      arr.remove(arr.size()-1);
}










}
