package leetcode16to30;

import java.util.*;

/**
 * @program: exercise
 * @description: 求解4数和为目标值
 * @author: guoyang
 * @create: 2019-02-25 16:23
 **/
public class FourSumSolution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        Set<String> forDelDup = new HashSet<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int low = j + 1;
                int high = nums.length - 1;
                while (low < high) {
                    int sum = nums[i] + nums[j] + nums[low] + nums[high];
                    if (sum == target) {
                        if (forDelDup.add(nums[i] + "" + nums[j] + nums[low] + nums[high])) {
                            ArrayList<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[low]);
                            list.add(nums[high]);
                            result.add(list);
                        }

                        low++;
                    } else if (sum < target) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new FourSumSolution().fourSum(new int[]{0, 0, 0, 0, 0, 0, 0}, 0));
    }

}
