public class compresseString {
    public static void main(String[] args) {
        String s="aaabbzztkk";
        StringBuilder sb=new StringBuilder();
     
        
        int i = 0;
        int n = s.length();
        
        while (i < n) {
            int j = i;
           
            while (j < n && s.charAt(i) == s.charAt(j)) {
                j++;
            }
            
            int freq = j - i;
           
            sb.append(s.charAt(i)); 
            // 
            // agar 1 freq huwa to likhna jaruri nahi hota hain boss;
           
            if (freq > 1) {
                sb.append(freq);
            }
            
            i = j; 
        }
        
        System.out.println(sb.toString());
         
        

    }
    
}
