class Solution {
    public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE, currentSum=0;
        for(int n : nums){
            currentSum +=n;
            sum = Math.max(currentSum, sum);
            if(currentSum < 0){
                currentSum =0;
            }
        }
        return sum;
    }
}