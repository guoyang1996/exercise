package leetcode31to45;

/**
 * @program: exercise
 * @description: 寻找第一个消失的正数
 * @author: guoyang
 * @create: 2019-03-26 10:04
 **/
public class FirstMissingPositiveSolution {
    public int firstMissingPositive(int[] nums) {
        int ans = 1;
        boolean flag = true;
        while(flag){
            flag = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == ans) {
                    flag=true;
                    ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new FirstMissingPositiveSolution().firstMissingPositive(new int[]{9,7,6,5,4,3,2,1}));
    }

}
