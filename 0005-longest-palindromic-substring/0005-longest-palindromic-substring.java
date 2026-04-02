class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        int maxLen=0;
        String result ="";
        for(int i=0; i< len ; i++){

            // For Odd length;
            int l =i, r =i;
            while(l >=0 && r < len && s.charAt(l) == s.charAt(r)){
                if((r-l+1) > maxLen){
                        result = s.substring(l, r+1);
                        maxLen = r-l+1;
                    }   
                l--;
                r++;
            }

            // For even length
            l =i; r =i+1;
            while(l >=0 && r < len && s.charAt(l) == s.charAt(r)){
                if((r-l+1) > maxLen){
                        result = s.substring(l, r+1);
                        maxLen = r-l+1;
                    }   
                l--;
                r++;
            }
        }
        return result;
    }
}