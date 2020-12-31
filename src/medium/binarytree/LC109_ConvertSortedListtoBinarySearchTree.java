package medium.binarytree;

import easy.binarytree.TreeNode;
import easy.linkedlist.ListNode;

/**
 * @Classname LC109_ConvertSortedListtoBinarySearchTree
 * @Description TODO
 * 题目：有序链表转换二叉搜索树
 * 解法1:1.
 * @Date 2020/12/31 19:50
 * @Created by youfayang
 */
public class LC109_ConvertSortedListtoBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)return null;
        if (head.next == null)return new TreeNode(head.val);
        ListNode preMidListNode = getPreListNode(head);
        ListNode root = preMidListNode.next;
        preMidListNode.next = null;
        TreeNode rootNode = new TreeNode(root.val);
        rootNode.left = sortedListToBST(head);
        rootNode.right = sortedListToBST(root.next);
        return rootNode;
    }

    private ListNode getPreListNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode preMid = slow;
        while (fast != null && fast.next != null){
            preMid = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return preMid;
    }
}
