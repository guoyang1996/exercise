package leetcode1to15;

public class MatchSolution {
    public boolean isMatch(String s, String p) {
        if (s == null && p == null) {
            return true;
        }
        if (s != null && s.isEmpty() && p != null && p.isEmpty()) {
            return true;
        }
        if (!p.contains("*")) {
            if (s.length() != p.length()) {
                return false;
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == p.charAt(i) || p.charAt(i) == '.') {

                } else {
                    return false;
                }
            }
            return true;
        } else {
            int index = p.indexOf('*');
            if (index == 0) {
                return false;
            } else {
                String lp, rp;
                if (index - 1 > 0) {
                    lp = p.substring(0, index - 1);
                } else {
                    lp = "";
                }
                if (index + 1 < p.length()) {
                    rp = p.substring(index + 1, p.length());
                } else {
                    rp = "";
                }
                char ch = p.charAt(index - 1);
                int ich = index - 1;
                while (ich < s.length()) {
                    if (s.charAt(ich) == ch || ch == '.') {
                        ich++;
                    } else {
                        break;
                    }
                }
                for (int i = index - 1; i <= ich; i++) {
                    String ls, rs;
                    if (index - 1 > 0&&index-1<=s.length()) {
                        ls = s.substring(0, index - 1);
                    } else {
                        ls = "";
                    }
                    if (i>=0&&i < s.length()) {
                        rs = s.substring(i, s.length());
                    } else {
                        rs = "";
                    }
                    if (isMatch(ls, lp) && isMatch(rs, rp)) {
                        return true;
                    }
                }
            }

        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(new MatchSolution().isMatch("aa", "a") == false);
        System.out.println(new MatchSolution().isMatch("aa", "a*") == true);
        System.out.println(new MatchSolution().isMatch("ab", ".*") == true);
        System.out.println(new MatchSolution().isMatch("aab", "c*a*b") == true);
        System.out.println(new MatchSolution().isMatch("mississippi", "mis*is*p*.") == false);

        System.out.println(new MatchSolution().isMatch("mississippi", "mis*is*ip*.") == true);
        System.out.println(new MatchSolution().isMatch("aaa", "a*a") == true);
        System.out.println(new MatchSolution().isMatch("a", ".*..a*") == false);
        System.out.println(new MatchSolution().isMatch("a", "ab*") == true);

    }

}