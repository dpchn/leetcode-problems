class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int left =0, right =0, len = s.length();
        int counterArr[] = new int [128];
        while(right < len){
            char ch = s.charAt(right);
            while(left < right && counterArr[ch] > 0){
                counterArr[s.charAt(left)]--;
                left++;
            }

            counterArr[ch]++;
            max = Math.max(max, right - left +1);
            right++;
        }
        return max;
    }
}