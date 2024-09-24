class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        findSubSet(nums, 0, nums.length, result, new ArrayList() );
        return result;
    }

    void findSubSet(int[] nums, int start, int len, List<List<Integer>> result, List<Integer> op){
        if(len-start==0){
            result.add(op);
            return;
        }

        List<Integer> op1= op;
        List<Integer> op2= addElement(op, nums[start]);
        start = start+1;
        findSubSet(nums, start,len, result, op1 );
        findSubSet(nums, start,len, result, op2 );
    }

    List<Integer>  addElement(List<Integer> op, int n){
        List<Integer> res = new ArrayList();
        res.addAll(op);
        res.add(n);
        return res;
    }

}