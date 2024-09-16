class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low =0, high = n-1;
        
        if (nums[low] <= nums[high]) {
            return nums[low];
        }
    
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Check if mid is the minimum element
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }
            
            // If the left side is sorted, go to the right
            if (nums[low] <= nums[mid]) {
                low = mid + 1;
            } else {
                // Otherwise, the minimum is in the left part
                high = mid - 1;
            }
        }
        return -1;
    }
}