class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0;
        int high = cols - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int row = 0;

            for (int i = 1; i < rows; i++) {
                if (mat[i][mid] > mat[row][mid]) {
                    row = i;
                }
            }

            int left = (mid > 0) ? mat[row][mid - 1] : -1;
            int right = (mid < cols - 1) ? mat[row][mid + 1] : -1;

            if (mat[row][mid] > left && mat[row][mid] > right) {
                return new int[]{row, mid};
            }

            
            if (left > mat[row][mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
}