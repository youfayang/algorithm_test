package easy.linkedlist;

/**
 * @Classname LC83_RemoveDuplicatesfromSortedList
 * @Description TODO
 * 题目：给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * 解法1:1.
 * @Date 2020/12/14 20:41
 * @Created by youfayang
 */
public class LC83_RemoveDuplicatesfromSortedList {
    public static void main(String[] args) {

    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode cur = head;
        while (cur.next != null){
            int curVal = cur.val;
            ListNode nextNode = cur.next;
            int nextVal = nextNode.val;
            if (curVal == nextVal){
                cur.next = nextNode.next;
            }else {
                cur = nextNode;
            }
        }
        return head;
    }
}
