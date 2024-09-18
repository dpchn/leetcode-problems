class Solution {
    // public int findPeakElement(int[] nums) {
    //     int len = nums.length;
    //     int low =0, high = len-1;
    //     while(low <high){
    //         int mid = low + (high-low)/2;
    //         if(mid>0 && mid < len-1 ){
    //             if(nums[mid]> nums[mid-1] && nums[mid]> nums[mid+1])
    //                 return mid;
    //             else if(nums[mid]< nums[mid+1] ){
    //                 low = mid+1;
    //             }else {
    //                 high = mid-1;
    //             }
    //         }else if(mid==0 && nums[mid] > nums[mid+1])
    //             return mid;
    //         else if(mid==len-1 && nums[mid] > nums[mid-1]){
    //             return mid;
    //         }else if(len==2){
    //             if(nums[0]> nums[1])
    //                 return 0;
    //             return 1;
    //         }
    //     }
    //     return low;
    // }


    public int findPeakElement(int[] nums) {
        int len = nums.length;
        int low =0, high = len-1;
        while(low <high){
            int mid = low + (high-low)/2;
            if(nums[mid] < nums[mid+1])
                low = mid+1;
            else 
                high = mid;
        }
        return high;
    }
    
}