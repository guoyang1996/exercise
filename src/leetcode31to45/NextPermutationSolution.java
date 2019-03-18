package leetcode31to45;

import java.util.Arrays;

/**
 * @program: exercise
 * @description: 数组的下一个字典序排列
 * @author: guoyang
 * @create: 2019-03-18 10:38
 **/
public class NextPermutationSolution {

    public void nextPermutation(int[] nums) {
        boolean isSorted = true;
        //虽然有两次循环，但是进入第二次循环时，就会退出第一次循环，故时间复杂度依然为O(n)
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                Arrays.sort(nums, i, nums.length);
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] > nums[i-1]) {
                        int tmp = nums[i-1];
                        nums[i-1] = nums[j];
                        nums[j] = tmp;
                        break;
                    }
                }
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            for (int i = 0; i < nums.length - i - 1; i++) {
               int tmp =  nums[nums.length - i - 1];
                nums[nums.length - i - 1] =nums[i];
                nums[i] = tmp;
            }
        }

    }

    public static void main(String[] args) {

        int[] input = new int[]{3, 2, 1};
        new NextPermutationSolution().nextPermutation(input);
        System.out.println(Arrays.toString(input));


    }


}

