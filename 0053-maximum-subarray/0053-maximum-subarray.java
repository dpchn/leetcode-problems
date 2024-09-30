class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0,max = Integer.MIN_VALUE;
        int i=0, j=0, len = nums.length;
        while(i<= j && j < len){
            sum +=nums[j];
            max = Math.max(max, sum);
            j++;
            if(sum <=0){
                i=j;
                sum=0;
            } 
        }
        return max;
    }
}