public class string3 {
    public static void main(String[] args) {
        String path="WNENESENNN";
        System.out.println(shortest(path));
    }
    public static  float shortest(String path) {
        int n=path.length();
        int x=0,y=0;
        for(int i=0;i<n;i++){
            char dir=path.charAt(i);
            if(dir=='S') {
                y--;

            }
              if(dir=='N') {
                y++;
                
            }
             else  if(dir=='W') {
                x--;
                
            }
            else {
                x++;
                
            }
            

        }

     return (float)Math.sqrt((x*x)+(y*y));   
    }
    
}
