package leetcode16to30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: exercise
 * @description: 找子串
 * @author: guoyang
 * @create: 2019-03-17 12:05
 **/
public class FindSubstringSolution {

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        if (s == null || s.length() == 0 || words.length == 0) {
            return ans;
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String str : words) {
            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1);
            }
        }
        for (int i = 0; i < s.length() - words[0].length() * words.length + 1; i++) {
            for (int j = 0; j < words.length; j++) {
                String str = s.substring(i + words[0].length() * j, i + words[0].length() * (j + 1));//从i开始，第j个词
                if (map.containsKey(str)) {
                    if (map.get(str) == 1) {
                        map.remove(str);
                    } else {
                        map.put(str, map.get(str) - 1);
                    }
                } else {
                    break;
                }
            }
            if (map.isEmpty()) {
                ans.add(i);
            }
            //这一部分可以通过添加临时map优化。我的思路是从map里减，
            // 看最后能否减到0.另一种思路是往map里加，最后判断两个map是否相等
            map = new HashMap<String, Integer>();
            for (String str : words) {
                if (!map.containsKey(str)) {
                    map.put(str, 1);
                } else {
                    map.put(str, map.get(str) + 1);
                }
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        //System.out.println(new FindSubstringSolution().findSubstring("wordgoodgoodgoodbestword", "word good best word".split(" ")));
        //System.out.println(new FindSubstringSolution().findSubstring("barfoothefoobarman", "bar foo".split(" ")));
        System.out.println(new FindSubstringSolution().findSubstring("wordgoodgoodgoodbestword", "word good best good".split(" ")));

    }


}
