package jianzhi.offer;

import java.util.Arrays;

/**
 * @program: exercise
 * @description: 扑克牌顺子
 * @author: guoyang
 * @create: 2018-04-09 16:32
 **/
public class ContinuousSolution {
    public boolean isContinuous(int[] numbers) {
        Arrays.sort(numbers);
        int magicNum = 0;//记录王的个数
        for(int i= 0;i<numbers.length;i++){
            if(numbers[i]==0){
                magicNum++;
            }
        }
        int flag = numbers.length - 1 - magicNum;
        int end = magicNum;
        for (int i = numbers.length - 1; i > end; i--) {
            if (numbers[i] - numbers[i - 1] == 1) {
                flag--;
            }
            for(int j=magicNum+1;j>1;j--){
                if (numbers[i] - numbers[i - 1] == j) {
                    flag--;
                    magicNum=magicNum-j+1;
                }
            }


        }

        return (0 == flag) && (magicNum >= 0);
    }

    public static void main(String[] args) {
        System.out.println(new ContinuousSolution().isContinuous(new int[]{0,3,2,6,4}));
    }
}
