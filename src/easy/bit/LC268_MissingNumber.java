package easy.bit;

/**
 * @Classname LC268_MissingNumber
 * @Description TODO
 * 题目：寻找丢失的数字
 * 解法1:1.
 * @Date 2021/1/4 20:56
 * @Created by youfayang
 */
public class LC268_MissingNumber {
    public int missingNumber(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret = ret ^ i ^ nums[i];
        }
        return ret ^ nums.length;
    }
}
