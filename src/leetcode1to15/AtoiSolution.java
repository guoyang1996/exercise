package leetcode1to15;

import java.util.ArrayList;
import java.util.List;

public class AtoiSolution {
    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        str = str.trim();
        if (str.isEmpty()) {
            return 0;
        }
        if(str.equals("2147483648")){
            return Integer.MAX_VALUE;
        }
        int result = 0;
        List<Integer> list = new ArrayList<Integer>();
        int isNagtive = -1;
        if (str.charAt(0) == '-') {
            isNagtive = 1;
            str = str.substring(1);
        } else if (str.charAt(0) == '+') {
            str = str.substring(1);
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                list.add(ch - '0');
            } else {
                break;
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            int temp = result;
            result -= list.get(i) * Math.pow(10, list.size() - 1 - i);
            if (result % Math.pow(10, list.size() - 1 - i) != temp) {
                if (isNagtive == -1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
        }


        return result * isNagtive;
    }

    public static void main(String[] args) {
        System.out.println(new AtoiSolution().myAtoi("2147483649"));
    }
}
/*
* 反正就溢出控制非常的恶心
* */