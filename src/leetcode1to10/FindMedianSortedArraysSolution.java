package leetcode1to10;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * You may assume nums1 and nums2 cannot be both empty.
 */
public class FindMedianSortedArraysSolution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;

        for (int k = 0; k < merge.length; k++) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    merge[k] = nums1[i];
                    i++;
                } else {
                    merge[k] = nums2[j];
                    j++;
                }
            } else if (i < nums1.length) {
                merge[k] = nums1[i];
                i++;
            } else if (j < nums2.length) {
                merge[k] = nums2[j];
                j++;
            }
        }
        if (merge.length % 2 == 0) {
            return ((double) (merge[(merge.length - 1) / 2] + merge[(merge.length + 1) / 2])) / 2;
        } else {
            return merge[merge.length / 2];
        }

    }

    public static void main(String[] args) {
        System.out.println(new FindMedianSortedArraysSolution().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

}
/*
* 就挺简单，先归并排序，然后求中位数就行了。不懂为什么要把这题标成hard
* */