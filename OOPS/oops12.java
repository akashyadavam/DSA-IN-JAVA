class Complexno{
    int x;int y;
    Complexno(int x,int y){
        this.x=x;
        this.y=y;
    }
    void print(){
        if(y>=0)
        System.out.println(x+"+"+y+"i");
        else
         System.out.println(x+""+y+"i");
    }
    void add(Complexno c2){
       this.y+=c2.y;
        this.x+=c2.x;
        // means c1 ka x c2 ka x add iska pass data c1 ka gya 
    }
     void multiply(Complexno c1){
        x=this.x*c1.x-this.y*c1.y;
        y=this.x*c1.y+this.y*c1.x;
        // yaaha this.x matlabl c2 ka x ; beacuse call ka c2 ka method lga rha hai; c1 ko pass because kyoi change nhi chahte usmein
        }
}
public class oops12 {
    public static void main(String[] args) {
        Complexno c1=new Complexno(3,4);
       // c1.print();
          Complexno c2=new Complexno(3,-4);
          // c2.print();
        c1.add(c2);//jisko add karavarahe hai  jisase print bhi use  karo c1 ka method pass
         c1.print();
         c2.print();
         c2.multiply(c1);
          c2.print();
    }
    
}
