public class SumOfSubstring {
    public static void main(String[] args) {
        String s="5721";
        int sum=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){//1 important or <= kar do;
               
                String sb=(s.substring(i,j)) ;
                int n=Integer.parseInt(sb);
                sum+=n;
                
            }
            
        

        }
        System.out.println(sum);
    }
}
