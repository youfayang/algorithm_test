package easy.linkedlist;

/**
 * @Classname LC206_ReverseLinkedList
 * @Description TODO 读清题意。
 * 题目：反转一个单链表。
 * 解法1: 迭代
 * 解法2: 递归
 * @Date 2020/12/13 15:59
 * @Created by youfayang
 */
public class LC206_ReverseLinkedList {
    public static void main(String[] args) {

    }

    //迭代
    public ListNode reverseList1(ListNode head) {
        if(head == null){
            return null;
        }
        //指向新链的头
        ListNode newHead = head;
        //指向没有拼进来的节点
        ListNode nextNode = head.next;
        head.next = null;
        while (nextNode != null){
            ListNode tmp = nextNode.next;
            nextNode.next = newHead;
            newHead = nextNode;
            nextNode = tmp;
        }
        return newHead;
    }

    //递归
    public ListNode reverseList2(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode newHead = head;
        ListNode nextHead = head.next;
        head.next = null;
        newHead = reverseList2(newHead,nextHead);
        return newHead;
    }

    private ListNode reverseList2(ListNode newHead, ListNode nextHead) {
        if (nextHead == null){
            return newHead;
        }
        ListNode tmp = nextHead.next;
        nextHead.next = newHead;
        newHead = nextHead;
        return reverseList2(newHead,tmp);
    }

    //Definition for singly-linked list.
//     public class ListNode {
//         int val;
//         ListNode next;
//         ListNode(int x) { val = x; }
//     }

}
