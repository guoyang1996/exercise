package leetcode16to30;

import leetcode1to15.ListNode;

/**
 * @program: exercise
 * @description: 成对的交换节点
 * @author: guoyang
 * @create: 2019-03-14 19:28
 **/
public class SwapPairsSolution {
    public ListNode swapPairs(ListNode head) {
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode p = head;
        if (p == null) {
            return null;
        }
        ListNode q = p.next;
        ListNode link = ans;
        while (p != null && q != null) {
            p.next = q.next;
            q.next = p;
            p = p.next;
            link.next = q;
            link = q.next;
            if (p != null) {
                q = p.next;
            }
        }
        return ans.next;

    }

    public static void main(String[] args) {
        System.out.println(new SwapPairsSolution().swapPairs(ListNode.arrayToList(new int[]{})));
    }
}
