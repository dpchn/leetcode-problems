class Solution {
    public int minPathSum(int[][] grid) {
        //init first row, nother other way to come there
        int rows = grid.length;
        int columns = grid[0].length;
        for(int j=1; j< columns; j++){
            grid[0][j] +=grid[0][j-1];
        }

        for(int i=1; i< rows; i++){
            grid[i][0] +=grid[i-1][0];
        }


        for(int i=1; i< rows; i++){
            for(int j=1; j< columns; j++){
                grid[i][j] +=Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }


        return grid[rows-1][columns-1];
    }
}