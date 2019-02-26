package leetcode1to15;

/*
 * 公共类
 * */

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }
    public static ListNode arrayToList(int[] nums){
        if(nums.length==0)return null;
        ListNode head = new ListNode(nums[0]);
        ListNode index = head;
        for(int i=1;i<nums.length;i++){
            ListNode node = new ListNode(nums[i]);
            index.next = node;
            index = node;
        }
        return head;
    }

    @Override
    public String toString() {
        ListNode head = this;
        StringBuilder sb = new StringBuilder();
        while(head!=null){
            sb.append(head.val);
            head = head.next;
            if(head!=null){
                sb.append("->");
            }
        }
        return sb.toString();
    }
}