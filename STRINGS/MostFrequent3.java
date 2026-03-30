public class MostFrequent3 {
    public static void main(String[] args) {
        String s="character";
        int n=s.length();
        int freq[]=new int [26];//by default sabki ferwuency zero set hain;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            freq[idx]++;
        }
        int maxfreq=0;
        char ans=s.charAt(0);
        for(int i=0;i<26;i++){
            if(freq[i]>maxfreq){
                maxfreq=freq[i];
                ans=(char)(i+97);
            }
        }
        System.out.println(ans);
    }
    
}
