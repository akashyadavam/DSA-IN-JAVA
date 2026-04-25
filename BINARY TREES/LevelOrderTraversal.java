import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;
class Pair {
    Node node;
    
    int level;

    Pair(Node node,int level) {
        this.level = level;
        this.node=node;
    }
}
class Node {
    Node left;
    Node right;
    int val;

    Node(int val) {
        this.val = val;
    }
}


// Pair object
// │
// ├── node → Node object
// │        ├── val = 3
// │        ├── left = address of another Node
// │        └── right = address of another Node
// │
// └── level = 0 samjh jao ab asani s

public class LevelOrderTraversal {
    public static void main(String[] args) {
         Node a = new Node(3);  
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node h = new Node(6);
        Node f = new Node(7);
        Node g = new Node(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.right = h;
         
    //    levelorder( a);//ek hi line mein print
        


        //levelorder( a);//level wise neter krke print 
      

      levelorder( a);//ye bhi level wise enter mrke print karega boss;





    // m3    ArrayList<ArrayList<Integer>> ans= ( levelorder(a));
    //   System.out.println(ans);
    }

   private static void levelorder(Node root) {
        Queue<Pair> q = new LinkedList<>();int currentlevel=0;
        q.add(new Pair(root,0));

        while (!q.isEmpty()) {
             Pair front = q.remove();
            
            if(front.level!=currentlevel){
                currentlevel++;
                System.out.println();
            }//enter ka kam yeh kr raha hain boss
           
            System.out.print(front.node.val + " ");

            if (front.node.left != null) q.add(new Pair(front.node.left,front.level+1));
              if (front.node.right != null) q.add(new Pair(front.node.right,front.level+1 ));

        }
        System.out.println();
    } 
   
   
   




   
   //m2 //    private static void levelorder(Node root) {
    //      Queue<Node> q = new LinkedList<>();
    //      q.add(root);
    //      while(q.size()!=0){
    //         int size=q.size();

    //         for(int i=0;i<size;i++){
    //              Node temp = q.remove();
            
    //             System.out.print(temp.val+" ");
    //              if (temp.left != null) q.add(temp.left);
    //         if (temp.right != null) q.add(temp.right);
    //         }
    //         System.out.println();



    //      }

    //    }



    //m1//
        // private static void levelorder(Node root) {
        //  Queue<Node> q = new LinkedList<>();
        //  q.add(root);
        //  while(q.size()!=0){
        //       Node temp=q.remove();
        //       System.out.print(temp.val+" ");
        //          if (temp.left != null) q.add(temp.left);
        //     if (temp.right != null) q.add(temp.right);
        //     }
        //     // System.out.println();



        //  }

       



    //m3 //   private  static ArrayList<ArrayList<Integer>> levelorder(Node root) {
    //      Queue<Node> q = new LinkedList<>();
    //      q.add(root);
    //       ArrayList<ArrayList<Integer>> a = new ArrayList<>();
    //       while(q.size()!=0){
    //         int size=q.size();
    //          ArrayList<Integer> b = new ArrayList<>();
    //         for(int i=1;i<=size;i++){
    //             Node t=q.remove();
    //             b.add(t.val);
    //              if (t.left != null) q.add(t.left);
    //           if (t.right != null) q.add(t.right);
    //         }
    //         a.add(b);
           

            

    //       }
    //       return a;
         


    //   }
    }
    

