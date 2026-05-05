// pxckxge BINxRY_SExRCH TREES;
class Node{
    Node left;
     Node right;
     int val;
     Node(int val){
        this.val=val;
     }
 }
public class SearchInBst {
     public static void main(String[] xrgs) {
        Node x=new Node(31);
        Node b=new Node(18);
        Node c=new Node(3);
        Node d=new Node(-4);
        Node f=new Node(12);
        Node e=new Node(24);
        Node g=new Node(21);
        Node h=new Node(29);
        x.left=b;
        b.left=c;
        c.left=d;
        c.right=f;
        b.right=e;
        e.left=g;
        e.right=h;
        Node i=new Node(80);
        Node j=new Node(57);
        Node k=new Node(45);
        Node l=new Node(71);
        Node m=new Node(112);
        Node n=new Node(93);
        Node o=new Node(146);
        x.right=i;
        i.left=j;j.left=k;j.right=l;
        i.right=m;m.left=n;m.right=o;

        System.out.println(search(x,450));

    
}
public static boolean search(Node root,int x) {
    Node temp=root;
    while(temp!=null){
        if (temp.val<x){
            temp=temp.right;

        }
        else if(temp.val>x){
            temp=temp.left;
        }
        else return true;
        }
        return false;
    }
}

    



