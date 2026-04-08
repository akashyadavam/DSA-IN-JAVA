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
    int size;
    void addAtHead(int val){
        Node t=new Node(val);//new node bani lekin iske age null hai aur abhi connect nahi huwa hai
        if(head==null){
            head=t;
            tail=t;
            size++;
        }
        else{
            t.next=head;
            head=t;
            size++;
        }
    }
     void addAtTail(int val){
        Node t=new Node(val);
        if(tail==null){
            head=t;
            tail=t;size++;
        }
        else{
             tail.next=t;
        tail=t;
        size++;
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
   void dissplay(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.next;
        

    }
    System.out.println();
    


    }
    int search(int val){
    
        if(head==null) return -1;
        Node temp=head;int idx=0;
        while(temp!=null){
            if(temp.val==val){
                return idx;
            }
            temp=temp.next;
            idx++;

           
        }
        return -1;
    }
    void insert(int idx,int val){
        if(idx<0||idx>size) {System.err.println("invalid idx");return;}
        if(idx==0)addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            Node t=new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;
        }

    }
     void  deleteAtHead(){
    if(head==null){
       System.out.println("list is empty"); 
       return;
    }
    head=head.next;
    if(head==null) tail=null;
 
  }
    void delete(int idx){
        if(idx<0||idx>=size){
            System.out.println("farzi");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;//delete
        if(idx==size-1) tail=temp;//we delete tail
        size--;


    }
}

public class linkedlist6 {
    public static void main(String[] args) {
         linkedlist ll=new linkedlist();
         ll.addAtHead(10);
        ll.display();
ll.addAtHead(20);ll.dissplay();
ll.addAtHead(30);ll.dissplay();
ll.dissplay();
ll.addAtTail(100);ll.display();
ll.addAtTail(200);ll.display();
ll.addAtTail(300);ll.display();
System.out.println(ll.search(200));
ll.display();
System.out.println(ll.size);
ll.insert(2,40);
ll.display();
ll.delete(2);
ll.display();


        
    }
}
