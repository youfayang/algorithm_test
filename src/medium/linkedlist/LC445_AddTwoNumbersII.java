package medium.linkedlist;

import easy.linkedlist.ListNode;

import java.util.Stack;

/**
 * @Classname LC445AddTwoNumbersII
 * @Description TODO
 * 题目：给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * 解法1:1.求和处理.remark 不可取，总会超长。
 * 解法2：用栈，注意进位处理。
 * @Date 2020/12/14 21:16
 * @Created by youfayang
 */
public class LC445_AddTwoNumbersII {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> stack1 = getStackFromListNode(l1);
        Stack<Integer> stack2 = getStackFromListNode(l2);
        Stack<Integer> resStack = new Stack<>();
        boolean hasCarry = false;
        while (!stack1.empty() || !stack2.empty() || hasCarry){
            int num1 = 0;
            if (!stack1.empty()){
                num1 = stack1.pop();
            }
            int num2 = 0;
            if (!stack2.empty()){
                num2 = stack2.pop();
            }
            int num = hasCarry ? num1+num2+1 : num1+num2;
            if (num >= 10){
                hasCarry = true;
                resStack.push(num % 10);
            }else {
                hasCarry = false;
                resStack.push(num);
            }
        }
        ListNode res = new ListNode();
        ListNode next = res;
        while (!resStack.empty()){
            next.next = new ListNode(resStack.pop());
            next = next.next;
        }
        return res.next;
        /**求和处理,总数会超长*/
/*        long val1 = 0L;
        while (l1 != null){
            val1 = val1 * 10L + l1.val;
            l1 = l1.next;
        }
        long val2 = 0L;
        while (l2 != null){
            val2 = val2*10l+l2.val;
            l2 = l2.next;
        }
        long sum = val1+val2;
        if (sum == 0){
            return new ListNode(0);
        }
        List<Integer> list = new ArrayList<>();
        while(sum != 0){
            list.add((int)sum%10);
            sum = sum/10;
        }
        ListNode res = new ListNode(list.get(list.size()-1));
        if (list.size() == 1){
            return res;
        }
        ListNode cur = res;
        for (int i = list.size()-2; i >=0; i--) {
             ListNode newNode = new ListNode(list.get(i));
             cur.next = newNode;
             cur = newNode;
        }
        return res;*/
    }

    private Stack<Integer> getStackFromListNode(ListNode l2) {
        Stack<Integer> stack = new Stack<>();
        while (l2 != null){
            stack.push(l2.val);
            l2 = l2.next;
        }
        return stack;
    }
}
