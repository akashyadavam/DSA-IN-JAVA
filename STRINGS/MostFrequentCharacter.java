public class MostFrequentCharacter {
    public static void main(String[] args) {
        String s="raghav";
        int n=s.length();
        char ans=s.charAt(0);
        int maxfreq=-1;
        for(int i=0;i<n-1;i++){
            int freq=1;
            char ch=s.charAt(i);
            for(int j=i+1;j<n;j++){
                if(s.charAt(j)==ch){
                    freq++;
                }
                
            }
            if(freq>maxfreq){
                maxfreq=freq;
                ans=ch;
            }
            else if(freq==maxfreq&&ch<ans){
                ans=ch;
        }

        }
        System.out.println(ans);
    }
    
} 
