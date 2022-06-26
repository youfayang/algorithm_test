package easy.linkedlist;

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
        ListNode res = mergeTwoLists2(l11,l21);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode mergeTwoLists3(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode res;
        if (list1.val < list2.val){
            list1.next = mergeTwoLists3(list1.next,list2);
            return list1;
        } else {
            list2.next = mergeTwoLists3(list1,list2.next);
            return list2;
        }
    }

    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode res = null;
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }

        if (list1.val < list2.val){
            res = list1;
            cur1 = list1.next;
        } else {
            res = list2;
            cur2 = list2.next;
        }
        mergeTwoLists2(res,cur1,cur2);
        return res;
    }

    private static void mergeTwoLists2(ListNode res, ListNode cur1, ListNode cur2) {
        if (cur1 == null){
            res.next = cur2;
            return;
        }
        if (cur2 == null){
            res.next = cur1;
            return;
        }
        if (cur1.val < cur2.val){
            res.next = cur1;
            cur1 = cur1.next;
        }else {
            res.next = cur2;
            cur2 = cur2.next;
        }
        mergeTwoLists2(res.next,cur1,cur2);
    }


    //todo 为啥不对。
    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
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


