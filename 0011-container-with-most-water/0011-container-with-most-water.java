class Solution {

    public int maxArea(int[] height) {
        int max = 0;
        int i=0, j = height.length-1;
        while(i<j){
            int width = j - i;
            int min = Math.min(height[i], height[j]);
            int area = width*min;
            max = Math.max(max, area);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
    // public int maxArea(int[] height) {
    //     int maxR[] = finMaxR(height);
    //     int maxL[] = finMaxL(height);
    //     int max = 0;
    //     for(int i=0; i< height.length; i++){
    //         int min = maxR[i]- maxL[i];
    //         max = Math.max(max, min*height[i]);
    //     }
    //     return max;
    // }


    // int [] finMaxR(int arr[]){
    //     int len = arr.length;
    //     int res[] = new int[len];
    //     int c = len-1;
    //     int maxSoFar = len-1;
    //     for(int i=len-1; i>=0; i--){
    //         if(arr[maxSoFar] <= arr[i])
    //             maxSoFar = i;
    //         res[c--] = maxSoFar;
    //     }
    //     return res;
    // }

    // int [] finMaxL(int arr[]){
    //     int len = arr.length;
    //     int res[] = new int[len];
    //     int c = 0;
    //     int maxSoFar = 0;
    //     for(int i=0; i<len; i++){
    //         if(arr[maxSoFar] <= arr[i])
    //             maxSoFar = i;
    //         res[c++] = maxSoFar;
    //     }
    //     return res;
    // }
}