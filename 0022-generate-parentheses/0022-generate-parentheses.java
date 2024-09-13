class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
        create("", n,0,0, list);
        return list;
    }

    void create(String parenthesis, int n, int open, int close, List<String> list){
        if(2*n==parenthesis.length()){
            list.add(parenthesis);
            return;
        }

        if(open < n){
            create(parenthesis+"(", n, open+1, close, list );
        }

        if(close < open)
            create(parenthesis+")", n, open, close+1, list );
    }
}