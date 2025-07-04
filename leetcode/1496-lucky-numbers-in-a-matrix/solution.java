class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int[] rowMinCols = new int[m];
        for (int i = 0; i < m; i++) {
            int minCol = 0;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < matrix[i][minCol]) {
                    minCol = j;
                }
            }
            rowMinCols[i] = minCol;
        }

        int[] colMaxRows = new int[n];
        for (int j = 0; j < n; j++) {
            int maxRow = 0;
            for (int i = 1; i < m; i++) {
                if (matrix[i][j] > matrix[maxRow][j]) {
                    maxRow = i;
                }
            }
            colMaxRows[j] = maxRow;
        }

        for (int i = 0; i < m; i++) {
            int col = rowMinCols[i];
            if (colMaxRows[col] == i) {
                ans.add(matrix[i][col]);
            }
        }

        return ans;
    }
}

