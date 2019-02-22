package leetcode1to15;

public class IntToRomanSolution {
    public String intToRoman(int num) {
        String str = "";
        int m = num / 1000;
        int c = (num - m * 1000) / 100;
        int l = (num - m * 1000 - c * 100) / 10;
        int i = num - m * 1000 - c * 100 - l*10;
        switch (m) {
            case 1:
                str += "M";
                break;
            case 2:
                str += "MM";
                break;
            case 3:
                str += "MMM";
                break;

        }

        switch (c) {
            case 1:
                str += "C";
                break;
            case 2:
                str += "CC";
                break;
            case 3:
                str += "CCC";
                break;
            case 4:
                str += "CD";
                break;
            case 5:
                str += "D";
                break;
            case 6:
                str += "DC";
                break;
            case 7:
                str += "DCC";
                break;
            case 8:
                str += "DCCC";
                break;
            case 9:
                str += "CM";
                break;
        }

        switch (l) {
            case 1:
                str += "X";
                break;
            case 2:
                str += "XX";
                break;
            case 3:
                str += "XXX";
                break;
            case 4:
                str += "XL";
                break;
            case 5:
                str += "L";
                break;
            case 6:
                str += "LX";
                break;
            case 7:
                str += "LXX";
                break;
            case 8:
                str += "LXXX";
                break;
            case 9:
                str += "XC";
                break;
        }

        switch (i) {
            case 1:
                str += "I";
                break;
            case 2:
                str += "II";
                break;
            case 3:
                str += "III";
                break;
            case 4:
                str += "IV";
                break;
            case 5:
                str += "V";
                break;
            case 6:
                str += "VI";
                break;
            case 7:
                str += "VII";
                break;
            case 8:
                str += "VIII";
                break;
            case 9:
                str += "IX";
                break;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(new IntToRomanSolution().intToRoman(1984));
    }
}
/*
 *
 * 就很暴力！啊哈！
 *
 *
 * */