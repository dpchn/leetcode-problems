class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        int min = Integer.MAX_VALUE;
        for(int p : prices){
            if(p < min){
                min =p;
            }else{
                maxProfit = Math.max(maxProfit, p- min);
            }
        }
        return maxProfit;
    }
}