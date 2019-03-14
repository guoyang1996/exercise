package leetcode16to30;

import leetcode1to15.ListNode;

/**
 * @program: exercise
 * @description: 合并两个排好序的数组
 * @author: guoyang
 * @create: 2019-03-12 15:18
 **/
public class MergeSortedListSolution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode head = res;
        ListNode p = l1;
        ListNode q = l2;
        while (p != null && q != null) {
            if (p.val < q.val) {
                res.next = new ListNode(p.val);
                res = res.next;
                p = p.next;
            } else {
                res.next = new ListNode(q.val);
                q = q.next;
                res = res.next;
            }
        }
        while (p != null) {
            res.next = new ListNode(p.val);
            res = res.next;
            p = p.next;
        }
        while (q != null) {
            res.next = new ListNode(q.val);
            q = q.next;
            res = res.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        System.out.println(new MergeSortedListSolution()
                .mergeTwoLists(ListNode.arrayToList(new int[]{1, 2, 4}), ListNode.arrayToList(new int[]{1, 3, 4})));
    }

}
