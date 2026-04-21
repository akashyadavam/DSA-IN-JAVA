import java.util.LinkedList;
import java.util.Queue;
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

        levelorder(a);//yahal level nahi bhejnenge use bnaneyenge class mein
    }

   // private static void levelorder(Node root) {
    //     Queue<Pair> q = new LinkedList<>();int currentlevel=0;
    //     q.add(new Pair(root,0));//yaha new pair object bnakar bhejenge jsimein root level ayenga kyoki hmne sirf root node bnayi hi lekin level bhi chaiye to pair new object bnakar bhej diya ab new object mein bn jayenga

    //     while (!q.isEmpty()) {
    //          Pair front = q.remove();
    //         //  Node node=front.node;
    //         //  int level=front.level;
    //         if(front.level!=currentlevel){
    //             currentlevel++;
    //             System.out.println();
    //         }
           
    //         System.out.print(front.node.val + " ");

    //         if (front.node.left != null) q.add(new Pair(front.node.left,front.level+1));
    //           if (front.node.right != null) q.add(new Pair(front.node.right,front.level+1 ));

    //     }
    //     System.out.println();
    // } 
       private static void levelorder(Node root) {
         Queue<Node> q = new LinkedList<>();
         q.add(root);
         while(q.size()!=0){
            int size=q.size();

            for(int i=0;i<size;i++){//particular level ke sare elemnt add honge ek bar mein hi
                 Node temp = q.remove();
            
                System.out.print(temp.val+" ");
                 if (temp.left != null) q.add(temp.left);//yaha se jitne elemnt add ho rhe hai left right ke 4 bache se size phir se 4 ho ja rha upar 4 temo banakr print to phir niche se add ho hi rhe hai to loop phir se chalenge jab ekdum null tab size =0 to loop chalenga hi nahi for loop
            if (temp.right != null) q.add(temp.right);
            }
            System.out.println();



         }

       }




    } 
    

