package leetcode16to30;

import leetcode1to15.ListNode;

/**
 * @program: exercise
 * @description: Remove Nth Node From End of List
 * @author: guoyang
 * @create: 2019-02-26 15:23
 **/
public class RemoveNthFromEndSolution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ahead = head;
        ListNode index = null;
        ListNode behind = head;
        int i=0;
        while(behind !=null ){
            if(i<n){
                i++;
            }else{
                index = ahead;
                ahead = ahead.next;
            }
            behind = behind.next;
        }
        //处理删除第一个节点的特殊情况
        if(index!=null){
            index.next=ahead.next;
        }else{
            index = ahead.next;
            return index;
        }

        return head;
    }

    public static void main(String[] args){
        ListNode list = ListNode.arrayToList(new int[]{1,2});
        System.out.println(new RemoveNthFromEndSolution().removeNthFromEnd(list,2));

    }

}
