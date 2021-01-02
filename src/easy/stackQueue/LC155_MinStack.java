package easy.stackQueue;

import java.util.Stack;

/**
 * @Classname LC155_MinStack
 * @Description TODO
 * 题目：最小栈
 * 解法1:1.
 * @Date 2021/1/2 15:23
 * @Created by youfayang
 */
public class LC155_MinStack {
    class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> minStack;

        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int x) {
            stack.push(x);
            minStack.push(Math.min(minStack.peek(),x));
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.isEmpty()?Integer.MAX_VALUE:minStack.peek();
        }
    }
}
