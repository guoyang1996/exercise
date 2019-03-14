package leetcode16to30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: exercise
 * @description: 生成合法括号
 * @author: guoyang
 * @create: 2019-03-12 15:57
 **/
public class GenerateParenthesesSolution {
    public List<String> generateParenthesis(int n) {
        Set<String> res = new HashSet<String>();
        if(n<=1){
            res.add("()");
        }else{
            List<String> child = generateParenthesis(n-1);
            for(String str :child){
                for(int i=0;i<str.length();i++){
                    String nstr = str.substring(0,i)+"()"+str.substring(i,str.length());
                    res.add(nstr);
                }
            }
        }
        return new ArrayList<>(res);
    }
    public static void main(String[] args){
       System.out.println(new GenerateParenthesesSolution().generateParenthesis(4));

    }

}
