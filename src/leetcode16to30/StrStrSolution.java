package leetcode16to30;

/**
 * @program: exercise
 * @description: 匹配字符串
 * @author: guoyang
 * @create: 2019-03-15 21:00
 **/
public class StrStrSolution {
    public int strStr(String haystack, String needle) {

        if(needle.equals("")){
            return 0;
        }
        int index = -1;
        for(int i=0;i<haystack.length();i++){
            char ch = haystack.charAt(i);
            boolean isMatched = true;
            for(int j=0;j<needle.length();j++){
                char cn = needle.charAt(j);
                if(i+j>=haystack.length()||cn!=haystack.charAt(i+j)){
                    isMatched = false;
                    break;
                }
            }
            if(isMatched){
                return i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(new StrStrSolution().strStr("aaa","aaaaaa"));
    }
}
