public class Palindrome {
    public static void main(String[] args) {
       
        String s="markram";
        
        System.out.println(checs(s));
    }
    public static boolean checs(String s) {
         int i=0;int j=s.length()-1;
    

        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            } 
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
    

