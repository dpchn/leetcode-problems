class Solution {
    public void sortColors(int[] nums) {

        int i=0, j= nums.length-1, mid=0;
        while(mid<=j){
                if(nums[mid]==0){
                    swap(nums,mid,i);
                    i++;
                    mid++;
                }else if(nums[mid]==1){
                    mid++;
                }else{
                    swap(nums,mid,j);
                    j--;
                }
            }
    }


    void swap(int[] num, int i, int j){
        int temp= num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}