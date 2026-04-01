class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{' || stack.isEmpty())
                stack.push(ch);
            else{
                char c= stack.peek();
                if(ch=='}' &&  c=='{' || ch==')' &&  c=='(' || ch==']' &&  c=='[')
                    stack.pop();
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}