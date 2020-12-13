package medium.array;

/**
 * @Classname LC240_Search2DMatrixII
 * @Description TODO
 * 题目：编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 * 解法1:1.从左上角到右下角进行搜索
 * @Date 2020/12/12 16:53
 * @Created by youfayang
 */
public class LC240_Search2DMatrixII {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{-5}};//{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searchMatrix(matrix,-10));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null){
            return false;
        }
        int l = matrix[0].length;
        int h = matrix.length;
        for(int i = 0; i < h; ){
            for(int j = l-1; j >= 0 && i < h; i++){
                if(matrix[i][j] == target){
                    return true;
                }else if(matrix[i][j] > target){
                    j--;
                }else{
                    i++;
                }
            }
        }
        return false;
    }
}
