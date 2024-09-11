class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack();
        int len = nums.length;
        int res[] = new int[len];
        int c=len-1;
        for(int i= len-1; i>=0; i--){
            if(stack.size()==0){
                res[c--] = nextGLeft(nums, i, nums[i]);
            }else if(stack.peek() > nums[i]){
                res[c--] = stack.peek();
            }else{
                while(stack.size() > 0 && stack.peek() <= nums[i])
                    stack.pop();
                if(stack.size()==0){
                    res[c--] = nextGLeft(nums, i, nums[i]);
                }else if(stack.size() > 0){
                    res[c--] = stack.peek();
                }
            }
            stack.push(nums[i]);
        }
        return res;
    }


    int nextGLeft(int arr[], int end, int element){
        int res=-1;
        for(int i=0; i<end; i++){
            if(arr[i] > element){
                return arr[i];
                // if(res == -1)
                //     res = arr[i];
                // else if(res > arr[i]){
                //      res = arr[i];   
                // }
            }
        }
        return res;
    }
}