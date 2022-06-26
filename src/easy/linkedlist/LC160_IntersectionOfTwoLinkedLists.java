package easy.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @Classname LC160_IntersectionOfTwoLinkedLists
 * @Description TODO
 * 题目：编写一个程序，找到两个单链表相交的起始节点。
 * 解法1:1.有公共终点。2.较长的节点走n步，逐个判断。
 * @Date 2020/12/13 15:33
 * @Created by youfayang
 */
public class LC160_IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode res = null;
        if (headA == null || headB == null){return null;}
        int lengthA = 1;
        int lengthB = 1;
        ListNode lastNodeA = headA;
        ListNode lastNodeB = headB;
        while (lastNodeA.next != null){
            lengthA++;
            lastNodeA = lastNodeA.next;
        }
        while (lastNodeB.next != null){
            lengthB++;
            lastNodeB = lastNodeB.next;
        }
        if (lastNodeA != lastNodeB){
            return null;
        }
        lastNodeA = headA;
        lastNodeB = headB;
        if (lengthA > lengthB){
            int n = lengthA - lengthB;
            while (n-- > 0){
                lastNodeA = lastNodeA.next;
            }
        } else {
            int n = lengthB - lengthA;
            while (n-- > 0){
                lastNodeB = lastNodeB.next;
            }
        }
        while (lastNodeA != null){
            if (lastNodeA == lastNodeB){
                return lastNodeA;
            } else {
                lastNodeA = lastNodeA.next;
                lastNodeB = lastNodeB.next;
            }
        }
        return null;
    }

//    Definition for singly-linked list.
    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        Set<ListNode> nodeSet = new HashSet<>(16);
        if (headA == null || headB == null){
            return null;
        }
        while (headA != null){
            nodeSet.add(headA);
            headA = headA.next;
        }
        while (headB != null){
            if (nodeSet.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
