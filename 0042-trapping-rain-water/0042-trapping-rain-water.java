class Solution {
    public int trap(int[] height) {
        // int sum =0;
        // int left[] =leftMax(height);
        // int right[] = rightMax(height);
        // for(int i=0; i< height.length; i++){
        //     sum = sum + Math.min(left[i], right[i]) - height[i];
        // }
        // return sum;

        return optimizeSolution(height);
        
    }


    int optimizeSolution(int[] height){
        int left=0;
        int leftMax=0;
        int right = height.length-1;
        int rightMax=0;
        int sum=0;

        while(left < right){
            if(height[left] < height[right]){
                if(height[left]> leftMax){
                    leftMax = height[left];
                }else{
                    sum = sum + leftMax - height[left];
                }
                left++;
            }else{
                if(height[right]> rightMax){
                    rightMax = height[right];
                }else{
                    sum = sum + rightMax - height[right];
                }
                right--;
            }
        }
        return sum;
    }


    int[] leftMax(int height[]){
        int maxSoFar=0, i=0;
        int result[] = new int[height.length];
        for(int n : height){
            maxSoFar = Math.max(maxSoFar, n);
            result[i++] = maxSoFar;
        }
        return result;
    }

    int[] rightMax(int height[]){
        int maxSoFar=0;
        int result[] = new int[height.length];
        for(int i=height.length-1; i>=0; i--){
            maxSoFar = Math.max(maxSoFar, height[i]);
            result[i] = maxSoFar;
        }
        return result;
    }
}