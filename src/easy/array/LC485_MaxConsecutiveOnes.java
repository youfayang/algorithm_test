package easy.array;

/**
 * @Classname LC485_MaxConsecutiveOnes
 * @Description TODO
 * 题目：给定一个二进制数组， 计算其中最大连续1的个数。
 * 解法1:1.
 * @Date 2020/12/12 16:29
 * @Created by youfayang
 */
public class LC485_MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int curLength = 0;
        for (int num : nums){
            if(num == 1){
                curLength++;
            }else {
                result = Math.max(curLength,result);
                curLength = 0;
            }
        }
        return Math.max(curLength,result);
    }
}
