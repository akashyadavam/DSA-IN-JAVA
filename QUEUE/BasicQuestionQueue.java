import java.util.LinkedList;
import java.util.Queue;

public class BasicQuestionQueue {
    public static void main(String[] args) {
          Queue<Integer> q=new LinkedList<>();
            q.add(10);
        q.add(20);
         q.add(30);
          q.add(40);
          q.add(50);
        q.add(70);
         q.add(80);
          q.add(90);
           System.out.println(q);
           add(q,60,5);
           System.out.println(q);
          System.out.println( peek(q,4));
          System.out.println(q);
          remove(q,2);
          System.out.println(q);
    }
    static void add( Queue<Integer> q,int val,int idx){
        int n=q.size();
        if (idx < 0 || idx > n) {
       System.out.println("Invalid Index");
        return; 
}
        if(idx==n){
            q.add(val);
            return;

        }
     
        for(int i=0;i<idx;i++){
             q.add(q.remove());
        }
        q.add(val);
         for(int i=0;i<n-idx;i++){
              q.add(q.remove());
        }
    }



    
    static int peek( Queue<Integer> q,int idx){
        int n=q.size();
        if (n == 0 || idx < 0 || idx >= n) {
        System.out.println("Invalid Index or Empty Queue");
        return -1;
    }
        for(int i=0;i<idx;i++){
             q.add(q.remove());
        }
        int a=q.peek();
         for(int i=0;i<n-idx;i++){
              q.add(q.remove());
        }
        return a;
    
}
 static void remove( Queue<Integer> q,int idx){
        int n=q.size();
        if (n == 0 || idx < 0 || idx >= n) {
        System.out.println("Invalid Index or Empty Queue");
        return;
    }
        for(int i=0;i<idx;i++){
             q.add(q.remove());
        }
             q.remove();
         for(int i=0;i<n-idx-1;i++){
              q.add(q.remove());
        }
}
}