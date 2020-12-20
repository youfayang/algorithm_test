package medium.linkedlist;

import easy.linkedlist.ListNode;

/**
 * @Classname LC328_OddEvenLinkedList
 * @Description TODO
 * 题目：给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 * 解法1:1.记录调整后奇数节点的末尾和偶数节点的末尾
 * @Date 2020/12/20 13:40
 * @Created by youfayang
 */
public class LC328_OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode res = oddEvenList(l1);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode oddTail = head;
        ListNode evenHead = head.next;
        ListNode evenTail = head.next;
        ListNode odd = head.next.next;
        while (odd != null){
            ListNode even = odd.next;
            oddTail.next = odd;
            odd.next = evenHead;
            oddTail = odd;
            if (even != null){
                odd = even.next;
                evenTail.next = even;
                evenTail = even;
            }else {
                //remark 记得将偶数表的链表末尾.next置为空
                evenTail.next = null;
                odd = null;
            }
        }
        return head;
    }
}
