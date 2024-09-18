/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int pivot = findPeakElement(mountainArr);
        int left = binarySearch(target,mountainArr, 0, pivot);
        int right = binarySearchInDesc(target,mountainArr, pivot+1, mountainArr.length()-1);
        if(left!=-1)
            return left;
        return right;
    }


    int findPeakElement(MountainArray mountainArr){
        int low =0, high = mountainArr.length()-1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(mountainArr.get(mid) < mountainArr.get(mid+1))
                low = mid+1;
            else 
                high = mid;
        }
        return low;
    }


    int binarySearch(int target, MountainArray mountainArr, int low, int high){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mountainArr.get(mid) == target)
                return mid;
            else if(mountainArr.get(mid) < target)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }


    int binarySearchInDesc(int target, MountainArray mountainArr, int low, int high){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mountainArr.get(mid) == target)
                return mid;
            else if(mountainArr.get(mid) > target)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
}