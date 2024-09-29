class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int plen = p.length();
        int slen = s.length();
        int sReq [] = new int[26];
        int pReq [] = new int[26];
        List<Integer> result = new ArrayList();

        if(plen > slen)
            return result;
        for(int i=0; i< plen; i++){
            pReq[p.charAt(i)-'a']++;
        }

        for(int i=0; i< plen; i++){
            sReq[s.charAt(i)-'a']++;
        }


        for(int i=plen; i< slen; i++){
            if(isSame(sReq, pReq)){
                result.add(i-plen);
            }
            
            sReq[s.charAt(i-plen)-'a']--;
            sReq[s.charAt(i)-'a']++;
        }

        if(isSame(sReq, pReq)){
                result.add(slen-plen);
        }

        return result;
    }



    boolean isSame(int sReq [], int pReq []){
        for(int i=0; i< 26; i++){
            if(sReq[i]!=pReq[i])
                return false;
        }
        return true;
    }
}