package medium.linkedlist;

import easy.linkedlist.ListNode;

/**
 * @Classname LC725_SplitLinkedListinParts
 * @Description TODO
 * 题目：给定一个头结点为 root 的链表, 编写一个函数以将链表分隔为 k 个连续的部分。
 * 每部分的长度应该尽可能的相等: 任意两部分的长度差距不能超过 1，也就是说可能有些部分为 null。
 * 这k个部分应该按照在链表中出现的顺序进行输出，并且排在前面的部分的长度应该大于或等于后面的长度。
 * 解法1:1.确定总长度 2.确定每部分长度 3.分割
 * @Date 2020/12/20 13:08
 * @Created by youfayang
 */
public class LC725_SplitLinkedListinParts {
    public ListNode[] splitListToParts(ListNode root, int k) {
        //1.确定总长度
        int size = 0;
        ListNode cur = root;
        while (cur != null){
            size++;
            cur = cur.next;
        }
        //2.确定每部分大小
        int smallSize = size/k;
        int bigSize = smallSize+1;
        int bigLength = size % k;
        //3.分割
        ListNode[] res = new ListNode[k];
        cur = root;
        for(int i = 0; i<k; i++){
            int curSize = i < bigLength ? bigSize : smallSize;
            ListNode head = cur;
            ListNode tail = cur;
            while (curSize >0 ){
                tail = cur;
                cur = cur.next;
                //remark 注意curSize--
                curSize--;
            }
            //后面几个循环里面有可能这个分割后的链表为空，此时tail=null
            if(tail != null){
                tail.next = null;
            }
            res[i] = head;
        }
        return res;
    }
}
