class Solution {
    public boolean isValid(String s) {
        char ch[] = s.toCharArray();
        Stack<Character> stack = new Stack();
        for(char c : ch){
            if(stack.isEmpty() || c=='(' || c=='{' || c=='[')
                stack.push(c);
            else{
                char cp = stack.peek();
                if(!stack.isEmpty() &&(cp=='(' && c==')' || cp=='{' && c=='}' || cp=='[' && c==']')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return  stack.isEmpty();
    }
}