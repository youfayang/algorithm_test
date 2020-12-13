package easy.array;

/**
 * @Classname LC566_ReshapeMatrix
 * @Description
 * 题目：
 * 解法1:1.
 * @Date 2020/12/12 15:58
 * @Created by youfayang
 */
public class LC566_ReshapeMatrix {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,2},{3,4},{5,6}};
        int[][] result = matrixReshape(nums,2,3);
        for(int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
               System.out.print(result[i][j]+",");
            }
            System.out.print("\n");
        }
    }
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums == null){
            return nums;
        }
        int h = nums.length;
        int l = nums[0].length;
        if(h*l != r*c){
            return nums;
        }
        int[][] result = new int[r][c];
        int index = 0;
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                int cur_h = index/l;
                int cur_l = index%l;
                result[i][j] = nums[cur_h][cur_l];
                index++;
            }
        }
        return result;
    }
}
