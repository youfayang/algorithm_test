package easy.bit;

/**
 * @Classname LC136_SingleNumber
 * @Description TODO
 * 题目：数组中只出现一次的数字
 * 解法1:1.
 * @Date 2021/1/4 20:46
 * @Created by youfayang
 */
public class LC136_SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            res = res ^ num;
        }
        return res;
    }
}
