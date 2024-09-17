class Solution {
    public int searchInsert(int[] nums, int target) {
        int res = -1;
        int low=0, high = nums.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid]== target)
                return mid;
            else if(nums[mid]<target){
                if(res==-1){
                   res = mid; 
                }else if(nums[res]< nums[mid]){
                    res = mid;
                }
                low = mid+1;
            }else{
                high =mid-1;
            }
        }
        return res+1;
    }


}