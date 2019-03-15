package leetcode16to30;

import leetcode1to15.ListNode;

/**
 * @program: exercise
 * @description: 翻转链表的k个元素
 * @author: guoyang
 * @create: 2019-03-15 12:54
 **/
public class ReverseKGroupSolution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ans = new ListNode(0);
        ListNode q = ans;
        ListNode p = head;
        ListNode np = head;
        for (int i = k; i >0; i--) {
            int index = 1;
            p = head;
            while (index < i && p != null) {
                p = p.next;
                index++;
            }
            if (p == null) {
                return head;
            } else {
                q.next = new ListNode(p.val);
                q = q.next;
            }
            if (index == k) {
                np = p.next;
            }
        }
        q.next = reverseKGroup(np, k);
        return ans.next;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseKGroupSolution().reverseKGroup(ListNode.arrayToList(new int[]{1, 2, 3, 4, 5, 6, 7, 8}), 3));
    }
}
