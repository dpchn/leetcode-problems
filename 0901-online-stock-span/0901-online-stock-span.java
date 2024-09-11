class StockSpanner {

    public StockSpanner() {
        
    }
    
    List<Integer> prices = new ArrayList();
    public int next(int price) {
        prices.add(price);
        int len = prices.size(); 
        return leftGreater(price);
    }

    int leftGreater(int price){
        int i = prices.size()-1;
        while(i >=0 && prices.get(i)<= price)
            i--;
        return prices.size() - i-1;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */