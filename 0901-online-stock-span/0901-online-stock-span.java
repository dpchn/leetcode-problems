class StockSpanner {

    List<Integer> prices;
    Stack<Integer> stack;
    public StockSpanner() {
        prices = new ArrayList();
        stack = new Stack();
    }
    
    
    // public int next(int price) {
    //     prices.add(price);
    //     int pge=-1;
    //     if(stack.size()==0){
    //         pge = -1;
    //     }else if(prices.get(stack.peek()) > price){
    //         pge = stack.peek();
    //     }else {
    //         while(stack.size() > 0 && prices.get(stack.peek()) <= price)
    //             stack.pop();
    //         if(stack.size()==0){
    //             pge = -1;
    //         }else{
    //             pge = stack.peek();
    //         }
    //     }
    //     stack.push(prices.size()-1);
    //     return prices.size()-1 - pge;
    // }

    public int next(int price) {
        prices.add(price);
        int pge=-1;
        while(stack.size() > 0 && prices.get(stack.peek()) <= price)
            stack.pop();
        
        if(stack.size()==0){
            pge = -1;
        }else{
            pge = stack.peek();
        }
        stack.push(prices.size()-1);
        return prices.size()-1 - pge;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */