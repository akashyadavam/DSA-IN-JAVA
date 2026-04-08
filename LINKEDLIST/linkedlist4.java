class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
// tail pr add karne ka program hai
class linkedlist{
    Node head;
    Node tail;
   
     void addAtTail(int val){
        Node t=new Node(val);
        if(tail==null){
            head=t;
            tail=t;
        }
        else{
             tail.next=t;
        tail=t;
        }
    }
       
        void display(){
            if(head==null)return;
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        

     }
}
public class linkedlist4 {
    public static void main(String[] args) {
        
    
//      Node a=new Node(10);
//     Node b=new Node(20);
//     Node c=new Node(30);
//     Node d=new Node(40);
//         Node e=new Node(50);
//         Node f=new Node(50);
//  a.next = b;
// b.next = c;
// c.next = d;
// d.next = e;
// e.next=f;
linkedlist ll=new linkedlist();
ll.addAtTail(10);
ll.addAtTail(20);
ll.addAtTail(30);
ll.display();
    
}
}
