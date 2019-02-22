package leetcode1to15;

/**
 * 求最大面积问题
 */
public class MaxAreaSolution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while (i<j){
            max = Math.max(max,(j-i)*Math.min(height[i],height[j]));
            System.out.println("i= "+i+" j="+j+" max="+max);
            if(height[i]<=height[j]){
                i++;
            }
            else{
                j--;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println( new MaxAreaSolution().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}

/**
 * 一开始用了一个n²的算法，简单粗暴。上面是双向指针，遍历所有可能情况的解决办法。
 */

