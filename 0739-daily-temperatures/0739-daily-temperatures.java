class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int  res[] = new int [len];
        int c= len-1;
        Stack<Integer> stack = new Stack();
        for(int i= len-1; i>=0; i--){
            if(stack.size()==0)
                res[c--] = 0;
            else if( temperatures[stack.peek()] >  temperatures[i]){
                int diff = stack.peek() - i;
                res[c--] = diff;
            }else{
                while(stack.size()>0 && temperatures[i] >= temperatures[stack.peek()])
                    stack.pop();
                if(stack.size()==0){
                    res[c--] = 0;
                }else{
                    res[c--] = stack.peek() - i;
                }
            }
            stack.push(i);
        }
        return res;
    }
}