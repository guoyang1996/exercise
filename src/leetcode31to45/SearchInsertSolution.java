package leetcode31to45;

/**
 * @program: exercise
 * @description: 二分查找加插入
 * @author: guoyang
 * @create: 2019-03-22 09:09
 **/
public class SearchInsertSolution {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        return searchInsert(nums, target, 0, nums.length - 1);
    }

    int searchInsert(int[] nums, int target, int i, int j) {
        int mid = (i + j) / 2;
        if (nums[mid] == target) return mid;
        if (j - i <= 1) {
            if(target > nums[j]) return j+1;
            if (target > nums[i]) return i+1;
            else return i;
        } else if (nums[mid] < target) return searchInsert(nums, target, mid, j);
        else return searchInsert(nums, target, 0, mid);
    }

    public static void main(String[] args) {
        System.out.println(new SearchInsertSolution().searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

}
