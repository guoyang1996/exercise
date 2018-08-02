package leetcode;

class ZigZagSolution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        int numColumns = s.length() / (2 * numRows - 2) * (numRows - 1)+s.length() % (2 * numRows - 2)-numRows+1;
        char[][] chs = new char[numRows][numColumns];
        for(int i=0;i<numRows;i++){
            for (int j = 0;j<numColumns;j++){
                chs[i][j]='0';
            }
        }
        for (int i = 0; i < s.length(); i++) {
            int count = i / (2 * numRows - 2);
            int mod = i % (2 * numRows - 2);
            int column;
            int row;
            if (mod >= numRows) {
                column = count * (numRows - 1) + mod - numRows+1;
                row = 2*numRows-mod-2;
            } else {
                column = count * (numRows - 1) ;
                row = mod;
            }
            chs[row][column] = s.charAt(i);
        }
        StringBuilder str  = new StringBuilder();
        for(int i=0;i<numRows;i++){
            for (int j = 0;j<numColumns;j++){
                if(chs[i][j]!='0'){
                    str.append(chs[i][j]);
                }
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ZigZagSolution().convert("ABCDE",4));
    }
}
/*
* 感觉一个纯数学问题？？？？？？？？？
* 想看更好的解法
* 
* */