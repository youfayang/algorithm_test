package medium.linkedlist;

import easy.linkedlist.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname LC19_RemoveNthNodeFromEndofList
 * @Description TODO
 * 题目：给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 解法1:1.用hashMap实现
 * 2.TODO 由于我们需要找到倒数第 nn 个节点，因此我们可以使用两个指针 \textit{first}first 和 \textit{second}second 同时对链表进行遍历，并且 \textit{first}first 比 \textit{second}second 超前 nn 个节点。当 \textit{first}first 遍历到链表的末尾时，\textit{second}second 就恰好处于倒数第 nn 个节点。
 * @Date 2020/12/14 20:49
 * @Created by youfayang
 */
public class LC19_RemoveNthNodeFromEndofList {
    public static void main(String[] args) {

    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int i = 0;
        Map<Integer,ListNode> map = new HashMap<>();
        while (cur != null){
            map.put(i++,cur);
            cur = cur.next;
        }
        int m = map.size() - n;
        ListNode preNode = map.get(m-1);
        if (preNode == null){
            return head.next;
        }
        preNode.next = map.get(m).next;
        return head;
    }
}
