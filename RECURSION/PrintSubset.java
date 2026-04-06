public class PrintSubset {
    public static void main(String[] args) {
        String s="abc";
        Subset("",s,0);
    }
    public static void  Subset(String ans, String s,int idx) {
        if(idx==s.length()){
            System.out.println(ans+" ");
            return;
        }
        char ch=s.charAt(idx);
         Subset(ans+ch, s, idx+1);//pick
        Subset(ans, s, idx+1);//skip
      
    }
    
}
