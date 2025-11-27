class StockSpanner {

    List<Integer> prices;
    Stack<Integer> indecies;
    public StockSpanner() {
        prices = new ArrayList();
        indecies = new Stack();
    }
    
    public int next(int price) {
        prices.add(price);


         while(!indecies.isEmpty() && prices.get(indecies.peek()) <= price)
            indecies.pop();

        int index = 0;
        if(indecies.isEmpty()){
            index =  -1;
        }else{
           index = indecies.peek();
        }
        indecies.push(prices.size()-1);
        return prices.size() - 1 - index;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */