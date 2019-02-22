package leetcode1to15;

public class LongestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        boolean isEnd = false;
        int i = 0;
        String prefix = "";
        while (!isEnd) {
            if (i >= strs[0].length()) {
                isEnd = true;
            }
            prefix = strs[0].substring(0, i);
            for (String str : strs) {
                if (!str.startsWith(prefix)) {
                    isEnd = true;
                    prefix=prefix.substring(0,prefix.length()-1);
                    break;
                }
            }
            i++;
        }
        return prefix;

    }

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefixSolution().longestCommonPrefix(new String[]{"a", "b"}));
    }
}