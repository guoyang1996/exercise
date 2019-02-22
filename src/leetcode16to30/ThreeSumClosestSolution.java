package leetcode16to30;

import java.util.Arrays;

/**
 * @program: exercise
 * @description: 最靠近目标值的三数和
 * @author: guoyang
 * @create: 2019-02-22 15:38
 **/
public class ThreeSumClosestSolution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length<3){
            return 0;
        }
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++){
            int low =i+1;
            int heigh = nums.length-1;
            while(low<heigh){
                int sum =nums[i]+nums[low]+nums[heigh];
                if(Math.abs(sum-target)<Math.abs(result-target)){
                    result = sum;
                }
                if(sum<target){
                    low++;
                }else{
                    heigh--;
                }
            }
        }

        return result;
    }
    public static void main(String[] args){
        System.out.println(new ThreeSumClosestSolution().threeSumClosest(new int[]{1,2,4,8,16,32,64,128},82));
        System.out.println(new ThreeSumClosestSolution().threeSumClosest(new int[]{4,0,5,-5,3,3,0,-4,-5},-2));
    }

}
