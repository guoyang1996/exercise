package leetcode;

class LongestPalindromeSolution {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        int index = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            for (; i - j >= 0 && i + j < s.length(); j++) {//点对称
                if (s.charAt(i - j) == s.charAt(i + j)) {
                } else {

                    break;
                }
            }
            if (j * 2 - 1 > max) {
                max = j * 2 - 1;
                index = i;
            }
            j = 0;
            for (; i - j >= 0 && i + j + 1 < s.length(); j++) {//轴对称
                if (s.charAt(i - j) == s.charAt(i + j + 1)) {
                } else {
                    break;
                }
            }
            if (j * 2 > max) {
                max = j * 2;
                index = i;
            }
        }
        if (max % 2 == 0) {
            return s.substring(index - max / 2 + 1, index + max / 2 + 1);
        } else {
            return s.substring(index - (max - 1) / 2, index + (max - 1) / 2 + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new LongestPalindromeSolution().longestPalindrome(""));
    }
}