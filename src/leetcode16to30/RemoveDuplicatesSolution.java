package leetcode16to30;

/**
 * @program: exercise
 * @description: 删除排序数组中的重复元素
 * @author: guoyang
 * @create: 2019-03-15 18:57
 **/
public class RemoveDuplicatesSolution {

    public int removeDuplicates(int[] nums) {

        int count = 0;
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                count++;
            }else{
                nums[j] = nums[i];
                j++;
            }

        }
        return nums.length-count;
    }

    public static void main(String[] args) {
        int[] input = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(new RemoveDuplicatesSolution().removeDuplicates(input));
    }

}
