class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int prev = prices[0];
        for(int n : prices){
            if(n < prev ){
                prev = n;
            }

            max = Math.max(max, n -prev );
        }
        return max;
    }
}