// package STACKS;
class Mystack{
    int[]arr=new int [5];
    int i=0;
    int size=0;
    void push(int x){
        if(i==5){
            System.out.println("full hai");
        return;
        }
        else {
        arr[i]=x;i++;size++;
    }
    }
    int peek(){
        if(size==0) return -1;
       else  return arr[size-1];
    }
    int pop(){
        if(i==0){
            System.out.println("nahi kar apyeneg deleet");
        }
        int a=arr[size-1];
        arr[size-1]=0;i--;size--;
        return a;
    }
    int size(){
        return size;
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    boolean isfull(){
        if(arr.length==size){
            return true;
        }
        else return false;
    }

}

public class ArraImplementation {
    public static void main(String[] args) {
        Mystack st=new Mystack();
        st.push(10);
        st.push(20);
        st.push(30);st.push(40);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
        st.push(50);
        st.push(60);st.display();  
        st.push(70);
        System.out.println(st.isfull()); 
    }
    
}
