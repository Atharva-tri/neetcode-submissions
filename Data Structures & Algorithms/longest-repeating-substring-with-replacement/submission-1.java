class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int max=0;
        int maxfreq=0;
        int [] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;
            maxfreq=Math.max(maxfreq,arr[s.charAt(i)-'A']);
            while((i-left+1)-maxfreq>k){
                 arr[s.charAt(left)-'A']--;
                 left ++;
            }
               max=Math.max(max,i-left+1);
        } 
        return max;
    }
}
