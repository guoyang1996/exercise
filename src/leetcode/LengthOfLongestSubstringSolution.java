package leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class LengthOfLongestSubstringSolution {

    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<Character>();//用于判断是否重复
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = 0;
            set.clear();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (set.add(ch)) {//如果至今未重复
                    temp++;

                } else {
                    break;
                }
            }
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
    public static  void main(String[] args){
        System.out.println(new LengthOfLongestSubstringSolution().lengthOfLongestSubstring("pwwkew"));
    }

}
/*
* 简单
* 要点在于如何判断是否重复
* 一遍搜索即可
* */