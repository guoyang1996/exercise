package leetcode31to45;

/**
 * @program: exercise
 * @description: 计数
 * @author: guoyang
 * @create: 2019-03-23 10:29
 **/
public class CountAndSaySolution {

    public String countAndSay(int n) {
        if (n == 1) return "1";
        //if (n == 1) return "11";


        String str = countAndSay(n - 1);
        StringBuilder ans = new StringBuilder("");
        char tmp = str.charAt(0);
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == tmp) {
                index++;
            } else {
                ans.append((char) ('0' + index)).append(tmp);
                tmp = ch;
                index = 1;

            }
        }
        ans.append((char) ('0' + index)).append(tmp);
        return ans.toString();

    }

    public static void main(String[] args) {
        System.out.println(new CountAndSaySolution().countAndSay(4));
    }
}
