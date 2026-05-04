class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0, result=0, i=0;
        int count[] = new int[128];
        for(i=0; i< s.length(); i++){
            char c = s.charAt(i);
            count[c]++;
            while(count[c]>1){
                count[s.charAt(left++)]--;
            }

            result = Math.max(result, i-left+1);
        }
        result = Math.max(result, i-left);
        return result;
    }
}