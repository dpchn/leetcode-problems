class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;

        int c = matrix[0].length;
        int r = matrix.length;
        int matrixint[][] = convert(matrix, r, c);
        int maxArea = 0;

        // Process each row as a histogram
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i > 0 && matrixint[i][j] != 0) {
                    matrixint[i][j] += matrixint[i - 1][j];
                }
            }

            // Find the maximum rectangle area for this histogram row
            maxArea = Math.max(maxArea, findMaxHeightArea(matrixint[i]));
        }

        return maxArea;
    }

    int[][] convert(char matrix[][], int r, int c) {
        int res[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = matrix[i][j] - '0';
            }
        }
        return res;
    }

    int findMaxHeightArea(int arr[]) {
        int nsr[] = findNSR(arr);
        int nsl[] = findNSL(arr);
        int maxArea = 0;

        for (int i = 0; i < arr.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int area = arr[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    int[] findNSR(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int len = arr.length;
        int res[] = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? len : stack.peek();
            stack.push(i);
        }

        return res;
    }

    int[] findNSL(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int len = arr.length;
        int res[] = new int[len];

        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        return res;
    }
}
