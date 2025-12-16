class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
      
        // Get the length of the array
        int n = nums.length;
      
        // Calculate the product of the three largest numbers
        // These are the last three elements after sorting
        int productOfThreeLargest = nums[n - 1] * nums[n - 2] * nums[n - 3];
      
        // Calculate the product of the largest number with the two smallest numbers
        // This handles the case where two negative numbers multiply to give a large positive
        int productOfLargestAndTwoSmallest = nums[n - 1] * nums[0] * nums[1];
      
        // Return the maximum of the two possible products
        return Math.max(productOfThreeLargest, productOfLargestAndTwoSmallest);
        // int max, secondMax, thirdMax, min, secondMin;
        // max = secondMax= thirdMax= Integer.MIN_VALUE;
        // min = secondMin= Integer.MAX_VALUE;
        // for(int n : nums){
        //     if(max < n){
        //         thirdMax = secondMax;
        //         secondMax = max;
        //         max = n;
        //     }

        //     if(min > n){
        //         min = n;
        //     }

        //     if(secondMin > min){
        //         secondMin = min;
        //     }
        // }

        // int maxProduct = max * secondMax * thirdMax;
        // int minProduct = min * secondMin * max;
        // return maxProduct > minProduct ? maxProduct : minProduct;
    }
}