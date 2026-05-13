// package HEAP;
import java.util.*;
class Heap{
    int arr[];
    int size=0;int i=1;
    int peek(){
        if(size()==0){
            System.out.println("error");
            return -1;
        }
        return arr[i];
    }
    void  add(int ele){
        if(i==arr.length){
            return ;
        }
        arr[i++]=ele;
        size++;
        int child=i-1;
        while(child!=1){
            int parent=child/2;
            if(arr[child]<arr[parent]){
            int temp= arr[child];
            arr[child]=arr[parent];
            arr[parent]=temp;
            child=parent;
        }
        else {break;}
    }
}
int remove(){

    if(size()==0){
        System.out.println("Heap empty");
        return -1;
    }

    int min = arr[1];

    arr[1] = arr[i-1];
    i--;
    size--;

    int parent = 1;

    while(true){

        int left = 2*parent;
        int right = 2*parent + 1;

        int smallest = parent;

        if(left <= size() && arr[left] < arr[smallest]){
            smallest = left;
        }

        if(right <= size() && arr[right] < arr[smallest]){
            smallest = right;
        }

        if(smallest == parent) break;

        int temp = arr[parent];
        arr[parent] = arr[smallest];
        arr[smallest] = temp;

        parent = smallest;
    }

    return min;
}

    void display(){
    for(int j=1; j<=size(); j++){
        System.out.print(arr[j]+" ");
    }
    System.out.println();
}
    int size(){
        return i-1;
    }
    Heap(int capacity){
        arr=new int [capacity+1];
       
    }     
    }
public class MinHeapImplementation {
    public static void main(String[] args) {
         Heap a=new Heap(10);
         a.add(10);
         a.add(3);
         a.add(2);
         a.add(11);
         a.add(9);
         a.display();
       System.out.println(  a.remove());a.add(100);
       a.display();

    } 
    
}
