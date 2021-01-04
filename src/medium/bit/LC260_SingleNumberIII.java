package medium.bit;

/**
 * @Classname LC260_SingleNumberIII
 * @Description TODO
 * 题目：找出数组中不重复的两个数字
 * 解法1:1.
 * @Date 2021/1/4 21:00
 * @Created by youfayang
 */
public class LC260_SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int lastRight = 0;
        for (int num : nums) {
            lastRight = lastRight ^ num;
        }
        lastRight = lastRight & (~ lastRight + 1);
        int ret1 = 0;
        int ret2 = 0;
        for (int num : nums) {
            if ((num & lastRight) == lastRight){
                ret1 = ret1 ^ num;
            } else {
                ret2 = ret2 ^ num;
            }
        }
        return new int[]{ret1,ret2};
    }
}
