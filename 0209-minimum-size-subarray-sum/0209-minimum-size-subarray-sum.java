class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int i=0, j=0, currentSum=0;
        while(j< nums.length){
            currentSum = currentSum + nums[j];
            while( currentSum >= target){
                min = Math.min(min, j-i+1);
                currentSum = currentSum - nums[i++];
            }
            j++;
        }
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}