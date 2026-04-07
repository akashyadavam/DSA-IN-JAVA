class ArrayList{//user defined data structuree;
    int []arr=new int [10];
    int idx=0;
    int size=0;
    ArrayList(int capacity){
        arr=new int [capacity];
    }
    void add(int ele){
        if(idx==arr.length){
            capacityincrease();

        }
        arr[idx++]=ele;
        size++;
    }
    void  capacityincrease(){
        int arr2[]=new int [arr.length*2];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];//copy paste

        }
        arr=arr2;//ab arr arr2 ki tarah point karbe lagega 


    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int get(int index){
        return arr[index];
    }
  

}

public class oops17 {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList(2);
        arr.add(10);
         arr.add(1);
        arr.display();
        System.out.println(arr.get(0));
         arr.add(100);
        arr.display();

        //insert and remove from end aur kya karna hai and remove wala code karna abhi baki hai;
    }
    
}
