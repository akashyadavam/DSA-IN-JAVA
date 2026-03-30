public class ReverseEachWordInString {
    public static void main(String[] args) {
        String s=" YE DUNIYA MEIN BAHUT FAKE PEOPLE HAI ";
        StringBuilder sb=new StringBuilder();
        int i=0;
        int n=s.length();
        while(i<n){
            if (i<n && s.charAt(i)==' '){
                sb.append(' ');i++;
            }
            if(i>n) break;
            int j=i;
            while(j<n&&s.charAt(j)!=' '){
                j++;
            }
            for (int k = j - 1; k >= i; k--) {
                sb.append(s.charAt(k));
            }
            i=j;


        }
        System.out.println(sb.toString());



        
    }
    
}
