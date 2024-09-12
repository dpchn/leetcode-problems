class Solution {
    public int trap(int[] height) {
        int maxR[] = findMaxSoFarR(height);
        int maxL[] = findMaxSoFarL(height);
        int total =0;
        for(int i=0; i< height.length; i++){
            int water = Math.min(maxR[i], maxL[i]) - height[i];
            total = total + water;
        }
        return total;
    }

    int[] findMaxSoFarR(int arr[]){
        int len = arr.length;
        int res[] = new int[len];
        int c = len-1;
        int maxSoFar = arr[len-1];
        for(int i = len-1; i>=0; i--){
            maxSoFar = Math.max(maxSoFar, arr[i]);
            res[c--] = maxSoFar;
        }
        return res;
    }


    int[] findMaxSoFarL(int arr[]){
        int len = arr.length;
        int res[] = new int[len];
        int c = 0;
        int maxSoFar = arr[0];
        for(int i = 0; i<len; i++){
            maxSoFar = Math.max(maxSoFar, arr[i]);
            res[i] = maxSoFar;
        }
        return res;
    }
}