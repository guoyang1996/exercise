package leetcode1to15;

import java.util.ArrayList;
import java.util.List;

public class ReverseIntegerSolution {
    public int reverse(int x) {
        int isNagtive = 1;
        if(x*(-1)==x){
            return 0;
        }
        if (x  <= 0) {
            x = x * (-1);
            isNagtive = -1;
        }
        List<Integer> list = new ArrayList<>();
        while (x != 0) {
            list.add(x % 10);
            x = x / 10;
        }
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            if(result+Math.pow(10, list.size() - i-1 )>0x7fffffff){
                return 0;
            }
            result += (int) list.get(i) * Math.pow(10, list.size() - i-1 );
        }
        return result*isNagtive;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseIntegerSolution().reverse(-2147483648));
        //System.out.println(Integer.toHexString(1534236469));
        //System.out.println(0x7fffffff);
    }
}
/*
* 控制溢出还是太恶心
*
* */