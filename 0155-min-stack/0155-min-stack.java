//Using extra Space
// class MinStack {

//     Stack<Integer> stack;
//     Stack<Integer> minStack;
//     public MinStack() {
//         stack = new Stack();
//         minStack = new Stack();
//     }
    
//     public void push(int val) {
//         stack.push(val);
//         if(minStack.isEmpty() || minStack.peek() >= val)
//             minStack.push(val);  
//     }
    
//     public void pop() {
//         int val = stack.pop();
//         if(minStack.peek() == val)
//             minStack.pop();
//     }
    
//     public int top() {
//         return stack.peek();
//     }
    
//     public int getMin() {
//         return minStack.peek();
//     }
// }


class MinStack {

    Stack<Long> stack;
    Long minE=Long.MAX_VALUE;
    public MinStack() {
        stack = new Stack();
    }
    
    public void push(int valv) {
        
       long val =  Long.valueOf(valv);
        if(stack.isEmpty()){
            stack.push(val);
            minE = val;
        }else if(val >= minE){
            stack.push(val);
        }else{
            long flag = 2*val - minE;
            stack.push(flag);
            minE = val;
        }     
    }
    
    public void pop() {
        long p = stack.pop();
        if(p < minE){
            minE = 2*minE -p;
        }
    }
    
    public int top() {
        if(stack.peek() < minE)
            return minE.intValue();
        return stack.peek().intValue();
    }
    
    public int getMin() {
        return minE.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */