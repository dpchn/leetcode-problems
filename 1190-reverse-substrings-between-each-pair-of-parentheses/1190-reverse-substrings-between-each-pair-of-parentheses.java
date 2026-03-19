class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(char ch : s.toCharArray()){
            if(ch==')'){
                StringBuilder sb = new StringBuilder();
                while(!stack.isEmpty() && stack.peek()!='('){
                    sb.append(stack.pop());
                }

                if(!stack.isEmpty())
                    stack.pop();

                for(int i=0; i< sb.length(); i++){
                    stack.push(sb.charAt(i));
                }
            }else{
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : stack){
            sb.append(c);
        }
        return sb.toString();
    }
}


/*
(ed(et(oc))el)

(ed(etco)el)

(edocteel)


(leetcode)

2.
(u(love)i)
(uevoli)
iloveu

(u(love)i)
reverse = evol
(uevoli)




*/