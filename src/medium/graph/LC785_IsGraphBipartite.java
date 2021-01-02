package medium.graph;

import java.util.Arrays;

/**
 * @Classname LC785_IsGraphBipartite
 * @Description TODO 需要回顾
 * 题目：判断二分图
 * 解法1:1.
 * @Date 2021/1/2 20:03
 * @Created by youfayang
 */
public class LC785_IsGraphBipartite {
    private static final int UNCOLORED = 0;
    private static final int RED = 1;
    private static final int GREEN = 2;
    private int[] color;
    private boolean valid;
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        valid = true;
        color = new int[n];
        Arrays.fill(color,UNCOLORED);
        for (int i = 0; i < n && valid; i++) {
            if (color[i] == UNCOLORED){
                dfs(i,RED,graph);
            }
        }
        return valid;
    }

    private void dfs(int node, int c, int[][] graph) {
        color[node] = c;
        int cNei = c==RED?GREEN:RED;
        for (int neighbor : graph[node]) {
            if (color[neighbor] == UNCOLORED){
                dfs(neighbor,cNei,graph);
            } else if(color[neighbor] != cNei){
                valid = false;
                return;
            }
        }
    }
}
