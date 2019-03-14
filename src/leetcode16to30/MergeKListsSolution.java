package leetcode16to30;

import leetcode1to15.ListNode;


/**
 * @program: exercise
 * @description: 合并k个已排序的列表
 * @author: guoyang
 * @create: 2019-03-14 18:51
 **/
public class MergeKListsSolution {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        int minIndex = -1;
        boolean isEnd = false;
        while (true) {
            isEnd = true;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null && lists[i].val <= min) {
                    minIndex = i;
                    min = lists[i].val;
                    isEnd = false;
                }
            }
            if (isEnd) {
                break;
            }
            head.next = new ListNode(lists[minIndex].val);
            head = head.next;
            lists[minIndex] = lists[minIndex].next;

        }
        return ans.next;
    }

    public static void main(String[] args) {
        ListNode[] listNodes = new ListNode[]{ListNode.arrayToList(new int[]{1, 3, 4, 5}),
                ListNode.arrayToList(new int[]{1, 3, 4, 5, 6}),
                ListNode.arrayToList(new int[]{2, 5, 7, 8}),
                ListNode.arrayToList(new int[]{5, 8, 9})};
        System.out.println(new MergeKListsSolution().mergeKLists(listNodes));
    }

}
