public class IntToString {
    public static void main(String[] args) {
        
        int n=10;
        String Y=" "+n;
        System.out.println(Y);
        // String z=" "+0.001;
        String b="00.001";
        System.out.println(b.length());
        String z=Y+0.001;
        System.out.println(z);
        System.out.println(z.length());
        System.out.println(Y.length()+","+Y);//CHARACTER;
        String s=Integer.toString(n);
        System.out.println(s);
        System.out.println(s.length());//no of digit short trick
        //this is prove that 10 output is string because string+int =string if it is integer then we would get 30; 
        System.out.println(s+10);


        String str="11111";
        int p=Integer.parseInt(str);//int mein convert hua string;
        System.out.println(p+1);
        String a="akash";
        char ch []=a.toCharArray();
        // for(int i=0;i<a.length();i++){
        //     System.out.print(ch[i]+" ");

        // } 
        for(char ele:ch){
            System.out.print(ele+" ");
        }
    }
    
}
