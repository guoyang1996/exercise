package leetcode31to45;

import java.util.Arrays;

/**
 * @program: exercise
 * @description: 二分查找某个数的范围
 * @author: guoyang
 * @create: 2019-03-21 10:20
 **/
public class SearchRangeSolution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        return searchRange(nums, target, 0, nums.length-1);
    }

    int[] searchRange(int[] nums, int target, int i, int j) {
        int mid = (i + j) / 2;
        if(j<i) return new int[]{-1,-1};
        if(i==j&&nums[mid]!=target) return new int[]{-1,-1};
        int left = mid;
        int right = mid;
        if (nums[mid] == target) {
            while (left >= i  && nums[left] == nums[mid]) { left--;}
            while (right <=j   && nums[right] == nums[mid]) {right++; }
            if(left+1<i) return new int[]{i, right-1};
            else if(right-1>j) return new int[]{left+1,j};
            else return new int[]{left+1, right-1};

        } else if (nums[mid] > target) return searchRange(nums, target, i, mid - 1);
        else return searchRange(nums, target, mid + 1, j);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SearchRangeSolution().searchRange(new int[]{2,2},1)));
    }

}
