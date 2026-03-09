class Solution {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        // for(int i=0; i< nums.length; i++){
        //     nums[i] = a*nums[i]*nums[i] + b*nums[i]+c;
        // }
        // Arrays.sort(nums);

        // return nums;

        int len = nums.length;
        int right=len-1, left=0;
        int result[] = new int[len];
        if(a >=0){
            int index=len-1;
            while(left <=right){
                int leftVal = transform(nums[left], a,b,c);
                int rightVal = transform(nums[right], a,b,c);
                if(leftVal< rightVal){
                    result[index] = rightVal;
                    right--;
                }else{
                    result[index] = leftVal;
                    left++;
                }
                index--;
            }
        }else{
            int index=0;
            while(left <=right){
                int leftVal = transform(nums[left], a,b,c);
                int rightVal = transform(nums[right], a,b,c);
                if(leftVal> rightVal){
                    result[index] = rightVal;
                    right--;
                }else{
                    result[index] = leftVal;
                    left++;
                }
                index++;
            }
        }
        return result;
    }


    int transform(int num, int a, int b, int c){
        return a*num*num + b*num+c;
    }
}