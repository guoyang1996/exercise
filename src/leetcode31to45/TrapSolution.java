package leetcode31to45;

/**
 * @program: exercise
 * @description: 水渠装水
 * @author: guoyang
 * @create: 2019-03-26 10:47
 **/
public class TrapSolution {
    public int trap(int[] height) {
        int ans = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        while (rightIndex < height.length && height[leftIndex] == 0) {
            leftIndex++;
            rightIndex++;
        }
        while (rightIndex < height.length) {

            while (rightIndex < height.length && height[rightIndex] < height[leftIndex]) {
                rightIndex++;
            }
            if (rightIndex == height.length) {
                rightIndex--;
                int max = rightIndex;
                while (rightIndex>leftIndex){
                    if(height[rightIndex]>height[max]) max = rightIndex;
                    rightIndex--;
                }
                rightIndex = max;

            }
            int h = Math.min(height[leftIndex], height[rightIndex]);
            for (int i = leftIndex; i < rightIndex; i++) {
                ans += h - height[i] > 0 ? h - height[i] : 0;
            }
            leftIndex = rightIndex;
            rightIndex++;
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(new TrapSolution().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println(new TrapSolution().trap(new int[]{4, 2, 3}));
    }

}
