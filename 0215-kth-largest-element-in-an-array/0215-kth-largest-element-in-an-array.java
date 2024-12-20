class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue(k);
        for(int n : nums){
            if(minHeap.size()<k){
                minHeap.add(n);
            }else if (n > minHeap.peek()){
                minHeap.poll();
                minHeap.add(n);
            }
        }

        return  minHeap.peek();
    }
}