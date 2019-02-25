package leetcode16to30;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: exercise
 * @description: 电话数字的字母组合
 * @author: guoyang
 * @create: 2019-02-23 21:32
 **/
public class LetterCombinationsSolution {

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        String[] maps = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for (int i = 0; i < digits.length(); i++) {
            char ch = digits.charAt(i);
            if (result.isEmpty()) {
                for(int k=0;k<maps[ch-'2'].length();k++){
                    result.add(maps[ch-'2'].charAt(k) + "");
                }
            } else {
                int currrentSize = result.size();
                for (int j = 0; j < currrentSize ; j++) {
                    String str = result.get(j);
                    for(int k=0;k<maps[ch-'2'].length();k++){
                        result.add(str + maps[ch-'2'].charAt(k) + "");
                    }
                }
                for (int j = 0; j < currrentSize ; j++) {
                    result.remove(0);

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LetterCombinationsSolution().letterCombinations("23"));
    }

}
