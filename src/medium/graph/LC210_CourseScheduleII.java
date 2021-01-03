package medium.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Classname LC210_CourseScheduleII
 * @Description TODO 需要回顾
 * 题目：课程安排
 * 解法1:1.
 * @Date 2021/1/3 16:58
 * @Created by youfayang
 */
public class LC210_CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] graphic = new List[numCourses];
        for (int i = 0; i<numCourses;i++) {
            graphic[i] = new ArrayList<>();
        }
        for (int[] prerequisite : prerequisites) {
            graphic[prerequisite[0]].add(prerequisite[1]);
        }
        boolean[] gloableMarked = new boolean[numCourses];
        boolean[] localMarked = new boolean[numCourses];
        Stack<Integer> postOrder = new Stack<>();
        for (int i = 0; i < numCourses; i++) {
             if(hasCycle(gloableMarked,localMarked,graphic,i,postOrder)){
                 return new int[0];
             }
        }
        int[] orders = new int[numCourses];
        for(int i = numCourses-1; i>=0;i--){
            orders[i] = postOrder.pop();
        }
        return orders;
    }

    private boolean hasCycle(boolean[] gloableMarked, boolean[] localMarked, List<Integer>[] graphic,
                             int curNode, Stack<Integer> postOrder) {
        if (localMarked[curNode]){
            return true;
        }
        if (gloableMarked[curNode]){
            return false;
        }
        localMarked[curNode] = true;
        gloableMarked[curNode] = true;
        for (int next : graphic[curNode]) {
            if (hasCycle(gloableMarked,localMarked,graphic,next,postOrder)){
                return false;
            }
        }
        localMarked[curNode] = false;
        postOrder.push(curNode);
        return false;
    }
}
