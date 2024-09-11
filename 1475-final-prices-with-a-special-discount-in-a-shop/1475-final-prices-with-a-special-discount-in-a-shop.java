class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack  = new Stack();
        int ln = prices.length;
        int c=ln-1;
        int res [] = new int[ln];
        for(int i= ln-1; i>=0; i--){
            if(stack.size()==0){
                res[c--] = prices[i];
            }else if(stack.peek() <= prices[i]){
                res[c--] = prices[i] - stack.peek();
            }else{
                while(stack.size()>0 && stack.peek() > prices[i])
                    stack.pop();

                if(stack.size()==0){
                    res[c--] = prices[i];
                }else{
                   res[c--] = prices[i] - stack.peek(); 
                }
            }
            stack.push(prices[i]);
        }
        return res;
    }
}