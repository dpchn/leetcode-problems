class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int low=0, high = len-1;
        int pivot = findPivot(nums);
        if(pivot ==-1){
            return findElementUsingBS(nums,target,low, high);
        }else if(nums[pivot]== target){
           return pivot; 
        }else if(target < nums[low]){
            return findElementUsingBS(nums,target,pivot+1, high);
        }else{
            return findElementUsingBS(nums,target,low, pivot-1);
        }
        
    }

    int findElementUsingBS(int[] nums, int target, int low, int high){
        while(low <=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target)
                return mid;
            else if(target<nums[mid])
                high = mid-1;
            else 
                low = mid+1;
        }
        return -1;
    }


    int findPivot(int arr[]){
        int len = arr.length;
        int low=0, high = len-1, prev, next;
        while(low <=high){
            int mid = low + (high - low)/2;
            prev = (mid-1+len)%len; 
            next = (mid+1)%len; 
            if(arr[mid] > arr[next])
                return mid;
            else if(arr[mid]<arr[prev])
                return mid-1;
            else if(arr[low] <= arr[mid])
                low  = mid+1;
            else 
                high = mid-1;
        }
        return -1;
    }
}