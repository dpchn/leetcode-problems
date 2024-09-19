class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int row = findRowNum(matrix, target);
    if (row == -1) 
        return false; 
    int col = findColNum(matrix[row], target); // Search in the found row
        return col != -1; 
}

int findRowNum(int[][] matrix, int target) {
    int row = matrix.length;
    int col = matrix[0].length;
    int low = 0, high = row - 1;
    
    // Binary search for the correct row
    while (low <= high) {
        int mid = low + (high - low) / 2;
        
        // Check if the target is in the current row
        if (matrix[mid][0] <= target && matrix[mid][col - 1] >= target) {
            return mid;  // Row found
        } else if (matrix[mid][0] > target) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return -1;  // Row not found
}

int findColNum(int[] row, int target) {
    int low = 0, high = row.length - 1;
    
    // Binary search for the target in the row
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (row[mid] == target) {
            return mid;  // Column found
        } else if (row[mid] > target) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return -1;  // Column not found
}

}