class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class linkedlist3 {
    public static int get(Node head,int idx){
        Node temp= head;//0 index ho gya
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    public static void main(String[] args) {
    Node a=new Node(10);
    Node b=new Node(20);
    Node c=new Node(30);
    Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(50);
        a.next = b;
b.next = c;
c.next = d;
d.next = e;
e.next=f;
            System.out.println(get(a,2));
    }
}
