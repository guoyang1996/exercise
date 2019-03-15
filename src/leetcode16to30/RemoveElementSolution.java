package leetcode16to30;

/**
 * @program: exercise
 * @description: 删除数组中指定元素
 * @author: guoyang
 * @create: 2019-03-15 20:29
 **/
public class RemoveElementSolution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            } else {
                nums[j] = nums[i];
                j++;
            }

        }
        return nums.length - count;
    }

    public static void main(String[] args) {
        int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new RemoveElementSolution().removeElement(input, 2));
    }

}
