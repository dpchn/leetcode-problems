class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        int res =-1;
        int low =0, high = len-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if( (mid== 0 || nums[mid-1]!=nums[mid]) && 
                (mid+1 == len || nums[mid+1]!=nums[mid])){
                return nums[mid];
            }
            
            int leftSize = mid;
            if(mid > 0 && nums[mid-1]== nums[mid]){
                leftSize = mid-1;
            }

            if(leftSize%2==0)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
}