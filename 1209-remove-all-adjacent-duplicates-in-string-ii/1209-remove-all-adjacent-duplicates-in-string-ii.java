class Solution {
    public String removeDuplicates(String s, int k) {
        int count[] = new int[s.length()];
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            sb.append(ch);
            int lastIdx = sb.length()-1;
            if(lastIdx>0 && sb.charAt(lastIdx) == sb.charAt(lastIdx-1)){
                count[lastIdx] = count[lastIdx -1]+1;
            }else{
                count[lastIdx] =1;
            }

            if(count[lastIdx] == k){
                sb.setLength(sb.length() - k);
            }
        }
        return sb.toString();
    }
}