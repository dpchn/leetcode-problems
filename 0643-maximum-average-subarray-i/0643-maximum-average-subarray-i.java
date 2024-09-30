class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE, sum=0;
        int i=0;

        for(int j=0; j< k; j++){
            sum +=nums[j];
        }
        
        maxAvg = sum;

        for(int j=k; j< nums.length; j++){
            sum = sum - nums[i++] + nums[j];
            maxAvg = Math.max(sum, maxAvg);
        }

        return maxAvg/k;
    }
}