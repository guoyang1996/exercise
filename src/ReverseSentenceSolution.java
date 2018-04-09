import java.util.Arrays;
import java.util.Stack;

/**
 * @program: exercise
 * @description: 翻转句子
 * @author: guoyang
 * @create: 2018-04-09 14:56
 **/
public class ReverseSentenceSolution {
    /**
     * @Description: 翻转句子牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，
     * 写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，
     * 有一天他向Fish借来翻看，但却读不懂它的意思。
     * 例如，“student. a am I”。
     * 后来才意识到，这家伙原来把句子单词的顺序翻转了，
     * 正确的句子应该是“I am a student.”。
     * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
     * @Param: [str]
     * @return: java.lang.String
     */
    public String ReverseSentence(String str) {
        if (str == null || str.isEmpty() || str.trim().equals("")) {
            return str;
        }
        Stack<String> stack = new Stack<String>();
        stack.addAll(Arrays.asList(str.split(" ")));
        StringBuilder res = new StringBuilder();
        while (!stack.empty()) {
            res.append(stack.pop());
            res.append(" ");
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println("\""+new ReverseSentenceSolution().ReverseSentence(" ")+"\"");
    }
}

