class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList();
        solve(s, "", res);
        return res;
    }


    void solve(String str, String op, List<String> res){
        if(str.length()==0){
            res.add(op);
            return;
        }

        if(Character.isDigit(str.charAt(0))){
            char c = str.charAt(0);
            str = str.substring(1, str.length());
            solve(str, op+c, res);
        }else{
            char c = str.charAt(0);
            str = str.substring(1, str.length());
            solve(str, op+Character.toLowerCase(c), res);
            solve(str, op+Character.toUpperCase(c), res);
        }

    }
}