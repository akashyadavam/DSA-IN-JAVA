package STACKS;
class Node{
    int val;Node next;
    Node(int val){
        this.val=val;
    }
}
class Mystack{
    Node head;
    int len;
    int peek(){
        if(head==null) {System.out.println("stack is empty"); return -1;}
        return head.val;
    }
    int pop(){//delete at head;
        if(head==null) {System.out.println("stack is empty"); return -1;}
        int x=head.val;
        head=head.next;
        len--;
        return x;
    }
    void push(int ele){
        Node t=new Node(ele);
        if(len==0) head=t;
        else{
        t.next=head;
        head=t;}
        len++;
    }
     int size (){
        return len;
     }
     void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
     }
}

public class LLImplementationOfStack {
    public static void main(String[] args) {
        Mystack st=new Mystack();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.display();
        st.pop();
         st.display();

    }
    
}
