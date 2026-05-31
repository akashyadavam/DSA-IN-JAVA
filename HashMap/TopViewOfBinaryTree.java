package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;
    Node(int val) {
        this.data = val; 
    }
}
class Pair{
    Node node;
    int dist;
    Pair(Node node,
    int dist){
        this.dist=dist;
        this.node=node;
    }
}
public class TopViewOfBinaryTree {
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
               HashMap<Integer,Integer>map=new HashMap<>();
               Queue<Pair> p=new LinkedList<>();
               p.add(new Pair(a,0));
               int mindist=Integer.MAX_VALUE;
               int maxdist=Integer.MIN_VALUE;
               while(p.size()>0){
                Pair front=p.remove();
                Node node=front.node;
                int dist=front.dist;
                mindist=Math.min(dist,mindist);
                maxdist=Math.max(dist,maxdist);
                if(!map.containsKey(dist))map.put(dist,node.data);
                if(node.left!=null)
                    p.add(new Pair(node.left,dist-1));
                if(node.right!=null)
                    p.add(new Pair(node.right,dist+1));
               }
               for(int i=mindist;i<=maxdist;i++){
                ans.add(map.get(i));
               }
               System.err.print(ans+" ");
    }  
}
