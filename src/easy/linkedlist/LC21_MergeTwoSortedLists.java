package easy.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname LC21_MergeTwoSortedLists
 * @Description TODO
 * 题目：将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
 * 解法1:1.
 * @Date 2020/12/13 17:32
 * @Created by youfayang
 */
public class LC21_MergeTwoSortedLists {
    public static void main(String[] args) {
        System.out.println("-----------------");
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        l11.next = l12;
        l12.next = l13;
        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;
        ListNode res = mergeTwoLists(l11,l21);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }



    //todo 为啥不对。
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = null;
        ListNode tail = null;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        while (cur1 != null  || cur2 != null){
            int value1 = Integer.MAX_VALUE;
            int value2 = Integer.MAX_VALUE;
            if (cur1 != null){
                value1 = cur1.val;
            }
            if (cur2 != null){
                value2 = cur2.val;
            }
            if (value1 < value2){
                ListNode newNode = new ListNode(value1,null);
                if (res == null){
                    res = newNode;
                    tail = newNode;
                }else {
                    tail.next = newNode;
                    tail =  tail.next;
                }
                cur1 = cur1.next;
            } else{
                ListNode newNode = new ListNode(value2,null);
                if (res == null){
                    res = newNode;
                    tail = newNode;
                }else {
                    tail.next = newNode;
                    tail =  tail.next;
                }
                cur2 = cur2.next;
            }
        }
        return res;
    }

}


