class Solution {
    // public String reverseParentheses(String s) {
    //     Stack<Character> stack = new Stack<Character>();

    //     for(char ch : s.toCharArray()){
    //         if(ch==')'){
    //             StringBuilder sb = new StringBuilder();
    //             while(!stack.isEmpty() && stack.peek()!='('){
    //                 sb.append(stack.pop());
    //             }

    //             if(!stack.isEmpty())
    //                 stack.pop();

    //             for(int i=0; i< sb.length(); i++){
    //                 stack.push(sb.charAt(i));
    //             }
    //         }else{
    //             stack.push(ch);
    //         }
    //     }

    //     StringBuilder sb = new StringBuilder();
    //     for(char c : stack){
    //         sb.append(c);
    //     }
    //     return sb.toString();
    // }



        public String reverseParentheses(String s) {
        int len = s.length();
        int pair[] = new int[len];
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0; i< len ; i++){
            char ch = s.charAt(i);
            if(ch==')'){
                int indx = stack.pop();
                pair[i]= indx;
                pair[indx]= i;
            }else if(ch=='('){
                stack.push(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        int d=1;
        for(int i=0; i< len; i= i+d){
            char ch = s.charAt(i);
            if(ch==')' || ch=='('){
                i = pair[i];
                d = -d;
            }else{
                sb.append(ch);
            }
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