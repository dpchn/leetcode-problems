class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int res[] = new int[len1];
        int c=0;
        Stack<Integer> stack = new Stack();
        for(int i=0; i< len1; i++){
            int len2= nums2.length;
            for(int j=0; j<len2; j++ ){
                if(nums1[i] == nums2[j]){
                    res[c++] = findNextGElement(nums1[i], j, len2-1, nums2);
                    break;
                }else if(j ==len2-1){
                    res[c++]=-1;
                }
            }
        }
        return res;
    }

    int findNextGElement(int e, int start, int end, int arr[]){
        for(int i=start; i<=end; i++){
            if(arr[i] > e ){
                return arr[i];
            }
        }
        return -1;
    }

}