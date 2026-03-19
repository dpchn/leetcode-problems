class Solution {
    // public String reverseParentheses(String s) {
    //     List<Character> stack = new ArrayList<Character>();

    //     for(int i=s.length()-1; i>=0; i--){
    //         char ch = s.charAt(i);
    //         if(ch=='('){
    //             StringBuilder sb = new StringBuilder();
    //             while(!stack.isEmpty() && stack.get(stack.size()-1)!=')'){
    //                 sb.append(stack.remove(stack.size()-1));
    //             }
    //             stack.remove(stack.size()-1);
    //             String reverse = sb.reverse().toString();
    //             for(char c : reverse.toCharArray()){
    //                 stack.add(c);
    //             }
    //         }else{
    //             stack.add(ch);
    //         }
    //     }

    //     StringBuilder sb = new StringBuilder();
    //     for(char c : stack){
    //         sb.append(c);
    //     }

    //     return sb.toString();
 
    // }


    public String reverseParentheses(String s) {
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
        if (ch == ')') {
            // 1. Pop characters until we hit '('
            StringBuilder temp = new StringBuilder();
            while (!stack.isEmpty() && stack.peek() != '(') {
                temp.append(stack.pop());
            }
            
            // 2. Remove the '(' from stack
            if (!stack.isEmpty()) {
                stack.pop();
            }

            // 3. Add the reversed characters back to the stack
            // Note: temp is already reversed because of how we popped from stack
            for (int i = 0; i < temp.length(); i++) {
                stack.push(temp.charAt(i));
            }
        } else {
            // Push letters and '(' onto the stack
            stack.push(ch);
        }
    }

    // Build final result from stack
    StringBuilder result = new StringBuilder();
    for (char ch : stack) {
        result.append(ch);
    }
    return result.toString();
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