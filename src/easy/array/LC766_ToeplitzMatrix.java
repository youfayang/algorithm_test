package easy.array;

/**
 * @Classname LC766ToeplitzMatrix
 * @Description TODO
 * 题目：如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是 托普利茨矩阵 。
 * 给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True
 * 解法1:1.从第一行的每个元素开始，2.从第一列的每个元素开始
 * @Date 2020/12/13 11:21
 * @Created by youfayang
 */
public class LC766_ToeplitzMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{ {1,2,3,4},
                {5,1,2,3},
                {8,5,1,2}};
        System.out.println(isToeplitzMatrix(matrix));
    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(m == 1 && n == 1){
            return true;
        }
        //遍历第一行
        for(int index = 0; index < n; index++){
            int cur = matrix[0][index];
            int i = 1;
            int j = index + 1;
            while (i < m && j < n){
                if (matrix[i++][j++] != cur){
                    return false;
                }
            }
        }
        //遍历第一列
        for(int index = 1; index < m; index++){
            int cur = matrix[index][0];
            int i = index + 1;
            int j = 1;
            while (i < m && j < n){
                if (matrix[i++][j++] != cur){
                    return false;
                }
            }
        }
        return true;
    }
}
