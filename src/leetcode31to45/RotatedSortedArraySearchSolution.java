package leetcode31to45;

/**
 * @program: exercise
 * @description: 在排好序但是断截的数组中搜索
 * @author: guoyang
 * @create: 2019-03-20 09:58
 **/
public class RotatedSortedArraySearchSolution {
    public int search(int[] nums, int target) {
        if(nums.length==0){
            return -1;
        }
        return search(nums, target, 0, nums.length - 1);

    }

    int search(int[] nums, int target, int i, int j) {
        int mid = (i + j) / 2;
        if (target == nums[mid]){
            return mid;
        }
        if(mid==i&&nums[j]!=target||j==i){
            return -1;
        }
        if(nums[j]==target){
            return j;
        }
        if(nums[mid]>nums[i]){
            if(nums[mid]<nums[j]){
                if(target>nums[mid]) return search(nums,target,mid+1,j);
                else return search(nums,target,i,mid-1);
            }else{
                if(target>nums[mid]) return search(nums,target,mid+1,j);
                else if(target<=nums[j]) return search(nums,target,mid+1,j);
                else return search(nums,target,i,mid-1);
            }
        }else{
            if(target>=nums[i]) return search(nums,target,i,mid-1);
            else{
                if(target>nums[mid]) return search(nums,target,mid+1,j);
                else return search(nums,target,i,mid-1);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(new RotatedSortedArraySearchSolution().search(new int[]{5, 6, 7, 8, 9, 1, 2, 4}, 9));
    }


}
