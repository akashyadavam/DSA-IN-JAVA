public class SpiralMatrix {
    //ye method sabke liye best hai koi dikkat nahi hain ismein;
    public static void main(String[] args) {
    int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
    int fr=0,lr=arr.length-1;
    int fc=0,lc=arr[0].length-1;
    while(fr<=lr&&fc<=lc){
        for(int i=fc;i<=lc;i++){
            System.out.print(arr[fr][i]+" ");
        }
        fr++;
        System.out.println();
     for(int i=fr;i<=lr;i++){
            System.out.print(arr[i][lc]+" ");
        }
        lc--;
        System.out.println();
        if(fr<=lr){//agar yha se bacha to niche jakar pil jayenga 
                for(int i=lc;i>=fc;i--){
            System.out.print(arr[lr][i]+" ");
        }
    }
        lr--;
        System.out.println();
        if(fc<=lc){
         for(int i=lr;i>=fr;i--){
            System.out.print(arr[i][fc]+" ");
        }
    }
        fc++;
        System.out.println();

    }

}

}