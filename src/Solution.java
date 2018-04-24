public class Solution {

    /**
     * @Description: 把一个字符串转换为数字
     * @Param: [str]
     * @return: int
     */
    public int StrToInt(String str) {
        if (str == null || str.equals("")) {
            return 0;
        }
        int symbol = 1;
        if(str.charAt(0)=='+'){
            str = str.substring(1);
        }else if(str.charAt(0)=='-'){
            str = str.substring(1);
            symbol = -1;
        }
       long res =0;
        for (int i = str.length() - 1; i >= 0; i--) {
            int num = char2Num(str.charAt(i));
            if (num < 0) {
                return 0;
            }
            res+=num*Math.pow(10,str.length() - 1-i);
        }
        return (int)res*symbol;
    }

    private int char2Num(char c) {

        switch (c) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().StrToInt("-2147483648"));
    }
}