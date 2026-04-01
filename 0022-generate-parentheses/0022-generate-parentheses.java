class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        generate("",n, 0, 0, result);
        return result;
    }


    void generate(String str, int n , int open, int close, List<String> result){
        if(open==n && n==close){
            result.add(str);
            return;
        }

        if(open < n){
            generate(str+"(", n, open+1, close, result);
        }

        if(close < open){
            generate(str+")",n, open, close+1, result);
        }
    }
}