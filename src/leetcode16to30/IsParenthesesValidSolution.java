package leetcode16to30;

import java.util.LinkedList;

/**
 * @program: exercise
 * @description: Valid Parentheses
 * @author: guoyang
 * @create: 2019-02-28 20:11
 **/
public class IsParenthesesValidSolution {
    public boolean isValid(String s) {

        LinkedList<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    stack.push(ch);
                    break;
                case ')':
                    if(!stack.isEmpty()&&stack.peek().equals('(')){
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }
                    break;
                case ']':
                    if(!stack.isEmpty()&&stack.peek().equals('[')){
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }
                    break;
                case '}':
                    if(!stack.isEmpty()&&stack.peek().equals('{')){
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }
                    break;
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(new IsParenthesesValidSolution().isValid("]"));
    }
}
