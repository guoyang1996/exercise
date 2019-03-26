package leetcode31to45;

import java.util.Arrays;

/**
 * @program: exercise
 * @description: 解数独问题
 * @author: guoyang
 * @create: 2019-03-23 09:18
 **/
public class SolveSudokuSoluiton {
    public void solveSudoku(char[][] board) {
        dfs(board, 0);
    }
    private boolean dfs(char[][] board, int d) {
        if (d == 81) return true;
        int i = d / 9;
        int j = d % 9;
        if (board[i][j] != '.') return dfs(board, d + 1);
        boolean[] flag = new boolean[10];
        validate(board, i, j, flag);
        for (int k = 1; k <= 9; k++) {
            if (flag[k]) {
                board[i][j] = (char) ('0' + k);
                if(dfs(board,d+1)) return true;
            }
        }
        board[i][j] ='.';
        return false;

    }
    private void validate(char[][] board, int i, int j, boolean[] flag) {
        Arrays.fill(flag,true);
        for (int k=0; k<9; k++) {
            if (board[i][k]!='.') flag[board[i][k]-'0']=false;
            if (board[k][j]!='.') flag[board[k][j]-'0']=false;
            int r=i/3*3+k/3;
            int c=j/3*3+k%3;
            if (board[r][c]!='.') flag[board[r][c]-'0']=false;
        }
    }


    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        new SolveSudokuSoluiton().solveSudoku(board);
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }

    }


}
