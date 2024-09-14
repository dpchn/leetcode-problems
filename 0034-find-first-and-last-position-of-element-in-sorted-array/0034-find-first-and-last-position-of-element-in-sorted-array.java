class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len= nums.length-1;
        int first =firstOccurance(nums, target, 0,len);
        int last =lastOccurance(nums, target, 0,len);
        return new int[]{first, last};
    }


    int firstOccurance(int arr[], int target, int i, int j){
        int res =-1;
        while(i<=j){
            int mid  = i + (j-i)/2;
            if(arr[mid]==target){
                res = mid;
                j = mid-1;
            }else if(arr[mid] < target){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return res;
    }


    int lastOccurance(int arr[], int target, int i, int j){
        int res =-1;
        while(i<=j){
            int mid  = i + (j-i)/2;
            if(arr[mid]==target){
                res = mid;
                i = mid+1;
            }else if(arr[mid] < target){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return res;
    }
}