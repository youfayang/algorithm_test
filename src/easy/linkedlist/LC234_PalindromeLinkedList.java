package easy.linkedlist;

/**
 * @Classname LC234_PalindromeLinkedList
 * @Description TODO
 * 题目：请判断一个链表是否为回文链表。
 * 解法1:1.双指针找到中点 2.对后半段进行翻转，判断回文。3.判断以后再翻转回来。
 * @Date 2020/12/19 21:43
 * @Created by youfayang
 */
public class LC234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && slow != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode midNode = slow;
        //从slow节点开始翻转
        return false;
    }
}
