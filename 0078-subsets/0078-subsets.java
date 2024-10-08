class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        findSubSet(nums, 0, nums.length, result, new ArrayList() );
        return result;
    }

    void findSubSet(int[] nums, int start, int len, List<List<Integer>> result, List<Integer> op){
        if(len-start==0){ //input empty then getting  output
            result.add(op);
            return;
        }

        List<Integer> op1= op;
        List<Integer> op2= addElement(op, nums[start]);
        start = start+1; //Keep reducing input
        findSubSet(nums, start,len, result, op1 ); //ith index element not choosen
        findSubSet(nums, start,len, result, op2 ); //ith index element  choosen
    }

    //Adding current element in output
    List<Integer>  addElement(List<Integer> op, int n){
        List<Integer> res = new ArrayList();
        res.addAll(op);
        res.add(n);
        return res;
    }

}