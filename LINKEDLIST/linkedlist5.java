 class Node {  // Isse add karo
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}
 class linkedlist{
    Node head;
    Node tail;
   
    void addAthHead(int val){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
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

public class linkedlist5 {
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.display();
        ll.addAthHead(10);
        ll.display();
ll.addAthHead(20);ll.display();
ll.addAthHead(30);ll.display();
ll.display();
    }
}
