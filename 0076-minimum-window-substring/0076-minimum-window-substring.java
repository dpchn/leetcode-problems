class Solution {
    public String minWindow(String s, String t) {
            Map<Character, Integer> freqmap = new HashMap();
            for(int i=0; i< t.length(); i++){
                char c = t.charAt(i);
                freqmap.put(c, freqmap.getOrDefault(c, 0)+1);
            }

            int count = freqmap.size(), i=0, j=0;
            int ansI=0, ansJ=0, ans=Integer.MAX_VALUE;
        while (j < s.length()) {
            char c = s.charAt(j);
            if (freqmap.containsKey(c)) {
                freqmap.put(c, freqmap.get(c) - 1);
                if (freqmap.get(c) == 0) {
                    count--; 
                }
            }

            // Step 3: When all characters are covered (count == 0)
            while (count == 0) {
                if (j - i + 1 < ans) {
                    ans = j - i + 1;
                    ansI = i;
                    ansJ = j + 1;
                }

                // Try to contract the window by moving 'i'
                char startChar = s.charAt(i);
                if (freqmap.containsKey(startChar)) {
                    freqmap.put(startChar, freqmap.get(startChar) + 1);
                    if (freqmap.get(startChar) > 0) {
                        count++; // We lost coverage of one unique character from 't'
                    }
                }
                i++;
            }
            j++; 
        }

        return ans == Integer.MAX_VALUE ? "" : s.substring(ansI, ansJ);
    }
}