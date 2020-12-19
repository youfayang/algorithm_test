package medium.linkedlist;

import easy.linkedlist.ListNode;

/**
 * @Classname LC24_SwapNodesinPairs
 * @Description TODO
 * 题目：给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 解法1:1.递归
 * @Date 2020/12/14 21:10
 * @Created by youfayang
 */
public class LC24_SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
