class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int pFreq[] = new int[26];
        int currentFreq[] = new int[26];
        for(int i=0; i< s1.length(); i++){
            pFreq[s1.charAt(i) - 'a']++;
        }

        
        int i=0, j=0, len =s2.length(), len1 = s1.length();
        while(j< len){
            currentFreq[s2.charAt(j)-'a']++;
            if(j>=len1-1){
                if(isSame(pFreq, currentFreq))
                    return true;
                currentFreq[s2.charAt(i)-'a']--;    
                i++;
            }
            j++;
        }

        return false;
    }


    boolean isSame(int pFreq[], int currentFreq[]){
        for(int i=0; i< 26; i++){
            if(pFreq[i] != currentFreq[i])
                return false;
        }
        return true;
    }
}