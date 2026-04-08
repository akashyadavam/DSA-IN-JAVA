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
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        

     }

  void  deleteAtHead(){
    if(head==null){
       System.out.println("list is empty"); 
       return;
    }
    head=head.next;
    if(head==null) tail=null;

  }
}







public class linkedlist7 {
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addAtTail(10);
// ll.addAtTail(20);ll.display();
// ll.addAtTail(30);ll.display();
// ll.display();
ll.deleteAtHead();ll.display();

    }
}
