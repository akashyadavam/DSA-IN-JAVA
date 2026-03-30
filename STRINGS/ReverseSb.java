public class ReverseSb {
    public static void main(String[] args) {
        String s="devesh";
        StringBuilder sb =new StringBuilder(s);
        // sb.reverse();
        //  System.out.println(sb);
    
        int i=0;int j=sb.length()-1;
        while(i<=j){
            char temp1=sb.charAt(i);
            char temp2=sb.charAt(j);
            sb.setCharAt(i, temp2);
            sb.setCharAt(j, temp1);
            i++;j--; 
        }
        // sb.insert(1,'d');
        System.out.println(sb);
    }
} 
