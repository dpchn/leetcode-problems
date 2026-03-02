class Solution {
    // public String removeDuplicates(String s) {
    //     Stack<Character> stack = new Stack();

    //     for(int i = s.length()-1; i>=0; i--){
    //         char c = s.charAt(i);
    //         if(stack.isEmpty()){
    //             stack.push(c);
    //         }else{
    //             boolean needToAdd = false;
    //             while(!stack.isEmpty() && stack.peek() == c){
    //                 stack.pop();
    //                 needToAdd = true;
    //             }

    //             if(!needToAdd){
    //                 stack.push(c);
    //             }
    //         }
    //     }

    //     StringBuilder sb = new StringBuilder();
    //     while(!stack.isEmpty()){
    //         sb.append(stack.pop());
    //     }

    //     return sb.toString();
    // }



    public String removeDuplicates(String s) {
        char[] res = s.toCharArray();
        int i = 0; // 'i' acts as the stack pointer (index of next available spot)

        for (int j = 0; j < s.length(); j++) {
            // res[j] is the current character we are looking at
            // if 'i > 0', we have elements in our "stack"
            // if 'res[i - 1] == res[j]', we found an adjacent duplicate
            if (i > 0 && res[i - 1] == res[j]) {
                i--; // "Pop" from stack by moving pointer back
            } else {
                res[i] = res[j]; // "Push" current char to the stack position
                i++; // Move pointer forward
            }
        }
        
        // The characters from index 0 to i represent the final string
        return new String(res, 0, i);
    }
}