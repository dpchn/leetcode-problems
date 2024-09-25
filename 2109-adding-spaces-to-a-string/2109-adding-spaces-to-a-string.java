class Solution {
    public String addSpaces(String s, int[] spaces) {
        char chr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int  i=0;
        for(int n : spaces){
            while(i < n){
                sb.append(chr[i++]);
            }
            sb.append(" ");
        }
        while(i< s.length()){
            sb.append(chr[i++]);
        }
        return sb.toString();
    }
}