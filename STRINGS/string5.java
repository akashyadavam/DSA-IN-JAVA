public class string5 {
    public static void main(String[] args) {
        String str="helloworld";
        System.out.println(subsstring(str,0,5));//bas kuch part print karana ho tab
      //in built  System.out.println(str.substring(0,5));
    }
    public static String subsstring(String str,int si,int ei) {
        String ss="";
        for(int i=si;i<ei;i++){
            ss+=str.charAt(i);
        }
        return ss;
        

    }  
}
