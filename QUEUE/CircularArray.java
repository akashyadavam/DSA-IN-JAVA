class CircularQueue{
    int []arr;int f;int r;int size;//jab khud se bnate hain private hi bnate hain hum;
    CircularQueue(int capacity){
        arr=new int [capacity];
    }
    void add(int val){
        if(size==arr.length){
            return ;//full hai queque
        }
        arr[r++]=val;
        if(arr.length==r) r=0;
        size++;

    }
    int remove(){
          if(size==0){
            return -1;//khali hai queque
        } 
         int front=arr[f];
         f++;
         if(f==arr.length) f=0;
         size--;
         return front;
        
    }
    int peek(){
          if(size==0){
            return -1;//khali hai queque
        } return arr[f];

    }
    void display(){
        if(size==0) return;
        if(f>=r){
            for(int i=f;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<r;i++){
                System.out.print(arr[i]+" ");
            }
        }
            else{
                 for(int i=f;i<r;i++){
                System.out.print(arr[i]+" ");

            }
        }
    }
    
}
    



public class CircularArray {
    public static void main(String[] args) {
         CircularQueue q=new  CircularQueue(5);
                 q.add(10);
        q.add(20);
         q.add(30);
          q.add(40);
          q.display();
          System.out.println();
           q.add(50);
          q.display();
          System.out.println();
           q.add(500);//size full
          q.display();
          System.out.println();
           q.remove();//size full
          q.display();


        
    }
    
}
