class Solution {
    // public int lengthOfLongestSubstring(String s) {
    //     int freq[] = new int[26];
    //     int len = s.length();
    //     int i=0,j=0;
    //     int max=0;
    //     if(s.trim().length()<2){
    //         if(s.length()==0)
    //             return 0;
    //         return 1;
    //     }
    //     while(j<len){
    //         char ch = s.charAt(j);
    //         if()
    //         freq[ch-'a']++;
    //         while(freq[ch-'a']>1){
    //             char c= s.charAt(i++);
    //             freq[c-'a']--;
    //         }

    //         max = Math.max(max, j-i+1);
    //         j++;
    //     }
    //     return max;
    // }



    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> freq = new HashMap();
        int len = s.length();
        int i=0,j=0;
        int max=0;
        while(j<len){
            char ch = s.charAt(j);
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
            while(freq.get(ch)>1){
                char c= s.charAt(i++);
                freq.put(c, freq.get(c)-1);
            }

            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}