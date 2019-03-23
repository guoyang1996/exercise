package leetcode31to45;

import java.util.Arrays;

/**
 * @program: exercise
 * @description: 检查是否为有效数独
 * @author: guoyang
 * @create: 2019-03-22 09:41
 **/
public class IsValidSudokuSolution {
    public boolean isValidSudoku(char[][] board) {
        int[] rowCheck = new int[9];//行校验
        int[] colCheck = new int[9];//列校验
        int[] reaCheck = new int[9];//矩形校验
        for (int i = 0; i < 9; i++) {
            Arrays.fill(rowCheck, 0);
            Arrays.fill(colCheck, 0);
            Arrays.fill(reaCheck, 0);
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') ;
                else if (rowCheck[board[i][j] - '1'] == 0) rowCheck[board[i][j] - '1'] = 1;
                else return false;
                if (board[j][i] == '.') ;
                else if (colCheck[board[j][i] - '1'] == 0) colCheck[board[j][i] - '1'] = 1;
                else return false;
                int row = i / 3 * 3 + j / 3;
                int col = i%3 * 3 + j % 3;
                //System.out.print(row +" "+col +" ="+board[row][col]+"    ");
                if (board[row][col] == '.') ;
                else if (reaCheck[board[row][col] - '1'] == 0) reaCheck[board[row][col] - '1'] = 1;
                else return false;
            }
            //System.out.println();

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsValidSudokuSolution().isValidSudoku(new char[][]{
                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}}));
    }

}
