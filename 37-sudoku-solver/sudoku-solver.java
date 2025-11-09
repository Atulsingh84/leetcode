class Solution {
    public void solveSudoku(char[][] board) {
      solve(board);
    }

         private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {  // empty cell

                    for (char c = '1'; c <= '9'; c++) { // try digits 1-9

                        if (isValid(board, row, col, c)) {
                            board[row][col] = c; // choose

                            if (solve(board))   // recurse
                                return true;

                            board[row][col] = '.'; // undo
                        }
                    }
                    return false; // no valid digit works
                }
            }
        }
        return true; // board filled
    }

    private boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {

            // Check row
            if (board[row][i] == c) return false;

            // Check column
            if (board[i][col] == c) return false;

            // Check 3x3 sub-grid
            int subRow = 3 * (row / 3) + i / 3;
            int subCol = 3 * (col / 3) + i % 3;
            if (board[subRow][subCol] == c) return false;
        }
        return true;
    }
}
    
