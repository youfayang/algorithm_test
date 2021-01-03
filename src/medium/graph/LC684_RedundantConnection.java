package medium.graph;

/**
 * @Classname LC684_RedundantConnection
 * @Description TODO 需要回顾
 * 题目：并查集
 * 解法1:1.
 * @Date 2021/1/3 17:28
 * @Created by youfayang
 */
public class LC684_RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        int N = edges.length;
        UF uf = new UF(N);
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (uf.connect(u,v)){
                return edge;
            }
            uf.union(u,v);
        }
        return new int[]{-1,-1};
    }

    private class UF{
        private int[] id;
        UF(int N) {
            id = new int[N+1];
            for (int i = 0; i < id.length; i++) {
                id[i] = i;
            }
        }
        void union(int u, int v){
            int uID = find(u);
            int vID = find(v);
            if (uID == vID){
                return;
            }
            for (int i = 0; i < id.length; i++) {
                if (id[i] == uID){
                    id[i] = vID;
                }
            }
         }
         int find(int p){
            return id[p];
         }
         boolean connect(int u,int v){
            return find(u) == find(v);
         }
    }
}
