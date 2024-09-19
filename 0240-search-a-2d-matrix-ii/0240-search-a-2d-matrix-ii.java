class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return search(matrix, target);
    }


    boolean search(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;
        int j = col-1;
        int  i=0;
        while(i<row && j>=0){
            int val = matrix[i][j];
            if(val==target)
                return true;
            else if(target < val)
                j--;
            else
                i++;
        }
        return false;
    }


    // int findRowNum(int[][] matrix, int target){
    //     int len = matrix.length;
    //     int low =0, high = len-1;
    //     while(low <=high){
    //         int mid = low + (high - low)/2;
    //         int next = (mid+1)%len;
    //         int prev = (mid-1+ len)%len;
    //         System.out.println(mid+" "+prev+" "+next);
    //         if(matrix[mid][0] == target)
    //             return mid;
    //         else if(target == matrix[next][0])
    //             return next;
    //         else if(matrix[prev][0]== target)
    //             return prev;
    //         else if(matrix[mid][0] < target)
    //             low = mid+1;
    //         else 
    //         high = mid-1;
    //     }
    //     return -1;
    // }


    // int finColNum(int[][] matrix, int target, int row){
    //     int len = matrix.length;
    //     int low =0, high = len-1;
    //     while(low <=high){
    //         int mid = low + (high - low)/2;
    //         if(matrix[mid][row] == target)
    //             return mid;
    //         else if(matrix[mid][row] < target)
    //             low = mid+1;
    //         else 
    //         high = mid-1;
    //     }
    //     return -1;
    // }
}