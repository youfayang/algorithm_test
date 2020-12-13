package medium.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Classname LC378_KthSmallestElementInSortedMatrix
 * @Description TODO
 * 题目：给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
 * 解法1:1.将数组排序，返回第k个
 * 解法2：
 * @Date 2020/12/12 17:35
 * @Created by youfayang
 */
public class LC378_KthSmallestElementInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 5, 9},{10, 11, 13},{12, 13, 15}};
        System.out.println(kthSmallestFromSort(matrix,8));
    }
    public static int kthSmallestFromSort(int[][] matrix, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length; j++){
                list.add(matrix[i][j]);
            }
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        return list.get(k-1);
    }
}
