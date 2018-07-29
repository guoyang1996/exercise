package leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class AddTwoSumSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode sum = result;
        boolean isCarry = false;
        while (l1 != null || l2 != null) {
            if (sum.next == null) {
                sum.next = new ListNode(0);
                sum = sum.next;
            }
            if (l1 != null) {
                sum.val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum.val += l2.val;
                l2 = l2.next;
            }
            if (isCarry) {
                sum.val += 1;
                isCarry = false;
            }
            if (sum.val > 9) {
                isCarry = true;
                sum.val -= 10;
            }

        }
        if (isCarry)

        {
            sum.next = new ListNode(0);
            sum.next.val = 1;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode res = new AddTwoSumSolution().addTwoNumbers(l1, l2);
        while (res != null) {
            System.out.print(res.val + "->");
            res = res.next;
        }


    }
}
/*
* 要点总结：主要考察链表操作、边界问题，以及指针指向的知识点。
*
* 概念都理解，就是操作不是很熟悉
*
* 需要严格测试
*
* 容易错
*
* */