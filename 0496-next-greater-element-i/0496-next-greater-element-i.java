class Solution {
     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length];
        Stack<Integer> stack = new Stack();
        for(int i=nums1.length - 1; i>=0; i--){
            for(int j=nums2.length-1; j>=0 ; j--){
                if(nums1[i] == nums2[j]){
                    if(stack.isEmpty()){
                        result[i] = -1;
                    }else if(stack.peek() > nums2[j]){
                        result[i] = stack.peek();
                    }else if(stack.peek() <= nums2[j]){
                        while(!stack.isEmpty() && stack.peek() <=nums2[j]){
                            stack.pop();
                        }
                        if(stack.isEmpty()){
                            result[i] = -1;
                        }else{
                            result[i] = stack.peek();
                        }
                    }   
                    break;
                }
                stack.push(nums2[j]);
            }
        }
        return result;
    }

}