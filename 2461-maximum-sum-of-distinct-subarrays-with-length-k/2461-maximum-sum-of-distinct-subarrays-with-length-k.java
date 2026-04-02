class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum=0;
        int left=0, right=0, len = nums.length;
        Map<Integer, Integer> map = new HashMap();
        long currentSum=0;
        while(right < k){
            while(map.containsKey(nums[right])){
                    currentSum -= nums[left];
                    map.remove(nums[left++]);
            }
            currentSum +=nums[right];
            map.put(nums[right], right);
            if((right- left+1) == k){
                maxSum = Math.max(maxSum, currentSum);
            }
            right++;
        }

        while(right < len){
            while(map.containsKey(nums[right])){
                    currentSum -=nums[left];
                    map.remove(nums[left++]);
            }
            currentSum +=nums[right];
            map.put(nums[right], right);
            if((right- left+1) > k){
                currentSum -=nums[left];
                map.remove(nums[left++]);
            }
            if((right- left+1) == k){
                maxSum = Math.max(maxSum, currentSum);
            }
            right++;
        }
        return maxSum;
    }
}