class Solution {
    public int[] sortedSquares(int[] nums) {
        int minIdx =0;
        int len = nums.length;
        for(int i=0; i< len; i++){
            int n = nums[i];
            if(Math.abs(n) < Math.abs(nums[minIdx]))
                minIdx = i;
        }
        
        int result[] = new int[len];
        int i=minIdx, j=minIdx+1, k=0;
        while(i>=0 && j< len){
            if( Math.abs(nums[i]) <= Math.abs(nums[j])){
                result[k++]= nums[i]*nums[i];
                i--;
            }else{
                result[k++]= nums[j]*nums[j];
                j++;
            }
        }


        while(i>=0){
            result[k++]= nums[i]*nums[i];
            i--;
        }

        while(j< len){
            System.out.println(k+" "+ j);
            result[k++]= nums[j]*nums[j];
            j++;
        }

        return result;
    }
}