package medium.stackQueue;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Classname LC503_NextGreaterElementII
 * @Description TODO
 * 题目：
 * 解法1:1.
 * @Date 2021/1/2 16:34
 * @Created by youfayang
 */
public class LC503_NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] next = new int[n];
        Arrays.fill(next,-1);
        Stack<Integer> pre = new Stack<>();
        for (int i = 0; i<2*n; i++) {
            int num = nums[i % n];
            while (!pre.isEmpty() && nums[pre.peek()] < num) {
                next[pre.pop()] = num;
            }
            if (i < n) {
                pre.push(i);
            }
        }
        return next;
    }
}
