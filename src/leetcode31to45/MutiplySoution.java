package leetcode31to45;

/**
 * @program: exercise
 * @description: 大数乘法
 * @author: guoyang
 * @create: 2019-03-27 10:01
 **/
public class MutiplySoution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        StringBuilder ans = new StringBuilder("");
        for (int i = num2.length() - 1; i >= 0; i--) {
            int a = num2.charAt(i) - '0';
            int carry = 0;
            StringBuilder temp = new StringBuilder();
            for (int k = 0; k < num2.length() - 1 - i;k++) temp.append('0');
            for (int j = num1.length() - 1; j >= 0; j--) {
                int b = num1.charAt(j) - '0';
                int mutiply = a * b;
                temp.append((char) ((mutiply + carry) % 10 + '0'));
                carry = (mutiply + carry) / 10;
            }
            if(carry!=0) temp.append((char) (carry+'0'));

            //合并结果
            StringBuilder sb = new StringBuilder("");
            int carry1 = 0;
            for (int j = 0; j < temp.length(); j++) {
                int a1 = 0;
                int b1 = temp.charAt(j) - '0';
                if (j < ans.length()) {
                    a1 = ans.charAt(j) - '0';
                }
                sb.append((char) ((a1 + b1 + carry1) % 10 + '0'));
                carry1 = (a1 + b1 + carry1) / 10;
            }
            if(carry1!=0) sb.append((char) (carry1+'0'));
            ans = sb;
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new MutiplySoution().multiply("13", "6"));
    }
}
