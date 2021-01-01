package easy.stackQueue;

import java.util.Stack;

/**
 * @Classname LC232_ImplementQueueusingStacks
 * @Description TODO
 * 题目：用栈实现队列
 * 解法1:1.
 * @Date 2021/1/1 21:32
 * @Created by youfayang
 */
public class LC232_ImplementQueueusingStacks {
    class MyQueue {
        private Stack<Integer> in = new Stack<>();
        private Stack<Integer> out = new Stack<>();

        /** Initialize your data structure here. */
        public MyQueue() {

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            in.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            out.clear();
            while (!in.empty()){
                out.push(in.pop());
            }
            int res = out.pop();
            while (!out.empty()){
                in.push(out.pop());
            }
            return res;
        }

        /** Get the front element. */
        public int peek() {
            out.clear();
            while (!in.empty()){
                out.push(in.pop());
            }
            int res = out.peek();
            while (!out.empty()){
                in.push(out.pop());
            }
            return res;
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return in.empty();
        }
    }
}
