class Solution {
    public int findDuplicate(int[] nums) {
       // Phase 1: Finding the intersection point in the cycle
        // Initialize tortoise and hare at the start
        int tortoise = nums[0];
        int hare = nums[0];

        // Move tortoise 1 step and hare 2 steps
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Phase 2: Finding the entrance to the cycle (the duplicate)
        // Reset tortoise to the start, leave hare at the meeting point
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return tortoise;
    }
}