class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0, count=0;
        int j=0;
        while(j< nums.length){
            if(nums[j] == 1)
                count++;
            else{
                max = Math.max(max, count);
                count=0;
            }
            j++;
        }
        max = Math.max(max, count);
        return max;
    }
}