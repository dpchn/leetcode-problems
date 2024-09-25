class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int  i=0;
        for(int n : spaces){
            while(i < n){
                sb.append(s.charAt(i++));
            }
            sb.append(" ");
        }
        while(i< s.length()){
            sb.append(s.charAt(i++));
        }
        return sb.toString();
    }
}