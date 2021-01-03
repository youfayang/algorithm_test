package medium.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname LC207_CourseSchedule
 * @Description TODO 需要回顾
 * 题目：课程安排的合法性
 * 解法1:1.
 * @Date 2021/1/2 20:29
 * @Created by youfayang
 */
public class LC207_CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graphic = new List[numCourses];
        for (int i = 0; i < numCourses; i++) {
             graphic[i] = new ArrayList<>();
        }
        for (int[] pre : prerequisites) {
            graphic[pre[0]].add(pre[1]);
        }
        boolean[] globalMarked = new boolean[numCourses];
        boolean[] localMarked = new boolean[numCourses];
        for (int i = 0; i<numCourses; i++){
            if(hasCycle(globalMarked,localMarked,graphic,i)){
                return false;
            }
        }
        return true;
    }

    private boolean hasCycle(boolean[] globalMarked, boolean[] localMarked, List<Integer>[] graphic, int curNode) {
        if(localMarked[curNode]){
            return true;
        }
        if (globalMarked[curNode]){
            return false;
        }
        globalMarked[curNode] = true;
        localMarked[curNode] = true;
        for (int nextNode : graphic[curNode]){
            if (hasCycle(globalMarked,localMarked,graphic,nextNode)){
                return true;
            }
        }
        localMarked[curNode] = false;
        return false;
    }


    /**遍历位置无法确定*/
//    boolean valid = true;
//    public boolean canFinish(int numCourses, int[][] prerequisites) {
//        int[][] graph = new int[numCourses][numCourses];
//        boolean[] see = new boolean[numCourses];
//        for (int[] ints : prerequisites) {
//            int s = ints[0];
//            int e = ints[1];
//            graph[s][e] = 1;
//        }
//        for(int i = 0; i< numCourses && valid; i++){
//            if (!see[i]){
//                dfs(graph, i, see);
//            }
//        }
//        return valid;
//    }
//
//    private void dfs(int[][] graph, int c, boolean[] see) {
//        see[c] = true;
//        int[] arr = graph[c];
//        for (int i = 0; i < arr.length; i++) {
//            int pre = arr[i];
//            if (pre == 0 || c == i){
//                continue;
//            }
//            if (see[i]){
//                valid = false;
//                return;
//            }else {
//                dfs(graph,i,see);
//            }
//        }
//    }
}
