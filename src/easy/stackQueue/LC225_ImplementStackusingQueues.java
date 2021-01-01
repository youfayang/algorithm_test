package easy.stackQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname LC225_ImplementStackusingQueues
 * @Description TODO
 * 题目：用队列实现栈
 * 解法1:1.
 * @Date 2021/1/1 21:41
 * @Created by youfayang
 */
public class LC225_ImplementStackusingQueues {
    class MyStack {
        private Queue<Integer> queue = new LinkedList<>();
        /** Initialize your data structure here. */
        public MyStack() {

        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue.add(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            int size = queue.size();
            Queue<Integer> temp = new LinkedList<>();
            while(size-- > 1){
                temp.add(queue.poll());
            }
            int res = queue.poll();
            queue = temp;
            return res;
        }

        /** Get the top element. */
        public int top() {
            int size = queue.size();
            Queue<Integer> temp = new LinkedList<>();
            while(size-- > 1){
                temp.add(queue.poll());
            }
            int res = queue.peek();
            temp.add(res);
            queue = temp;
            return res;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
