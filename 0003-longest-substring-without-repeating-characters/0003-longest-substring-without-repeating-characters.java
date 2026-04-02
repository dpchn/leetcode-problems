class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count[] = new int[128];
        int maxLen=0, left=0, i=0;
        for(i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            count[ch]++;
            while(count[ch]>1){
                count[s.charAt(left++)]--;
            }

            maxLen= Math.max(maxLen, i-left+1);
        }
        maxLen= Math.max(maxLen, i-left);
        return maxLen;
    }
}