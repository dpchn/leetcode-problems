class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList();
        int i=0, j = nums.length-1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(nums[mid]==target){
                i = mid;
                while(i>0 && nums[i-1]==target)
                    i--;
                while(i<nums.length && nums[i]==target){
                    result.add(i);
                    i++;
                }
                return result;
            }else if(nums[mid] < target){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return result;
    }
}