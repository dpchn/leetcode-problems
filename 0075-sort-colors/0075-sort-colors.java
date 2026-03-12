class Solution {
    public void sortColors(int[] nums) {

        int left=0, right= nums.length-1, mid=0;
        while(mid <=right){
            switch(nums[mid]){
                case 0:
                    swap(nums,mid, left);
                    mid++;
                    left++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, right);
                    right--;
            }
        }
       
    }


    void swap(int[] num, int i, int j){
        int temp= num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}