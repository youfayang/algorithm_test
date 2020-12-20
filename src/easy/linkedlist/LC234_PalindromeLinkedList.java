package easy.linkedlist;

/**
 * @Classname LC234_PalindromeLinkedList
 * @Description TODO
 * 题目：请判断一个链表是否为回文链表。
 * 解法1:1.双指针找到中点 2.对后半段进行翻转 3.判断回文。4.判断以后再翻转回来。
 * @Date 2020/12/19 21:43
 * @Created by youfayang
 */
public class LC234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        //remark 注意判空。
        if(head == null || head.next == null){
            return true;
        }
        //1.找中点
        ListNode fast = head;
        ListNode slow = head;
        //remark 对于快慢指针的处理，while条件是fast != null && fast.next != null
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //remark 翻转链表时：一个指向新的头节点，一个指向未接入的节点。循环判断新节点不为空，循环里面先缓存新的未接入节点

        //2.从slow节点开始翻转
        //指向新节点的头
        ListNode newHead = slow;
        //指向未拼进来的节点
        ListNode nextNode = slow.next;
        slow.next = null;
        while(nextNode != null){
            ListNode temp = nextNode.next;
            nextNode.next = newHead;
            newHead = nextNode;
            nextNode = temp;
        }

        //3.判断回文
        ListNode left = head;
        ListNode right = newHead;
        while (left != null && right != null){
            if (left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        //4.翻转回来。
        nextNode = newHead.next;
        newHead.next = null;
        while (nextNode != null){
            ListNode temp = nextNode.next;
            nextNode.next = newHead;
            newHead = nextNode;
            nextNode = temp;
        }
        return true;
    }
}
