public class Removeduplicate {
    public static void main(String[] args) {
        String str="apnacollege";
        
        removeduplicate(str,0,new StringBuilder(""),new boolean[26]);
    }
    public static void removeduplicate(String str, int indx,StringBuilder newString,boolean map[]) {
        if(indx==str.length()){
            System.out.println(newString);
            return;
        }
         char ch=str.charAt(indx);
         if(map[ch-'a']==true){
            removeduplicate(str, indx+1, newString,map);

         }
         else{
            map[ch-'a']=true;
            removeduplicate(str, indx+1, newString.append(ch),map);
         }

    }
}
