package medium.bit;

/**
 * @Classname LC338_CountingBits
 * @Description TODO
 * 题目：统计从 0 ~ n 每个数的二进制表示中 1 的个数
 * 解法1:1.
 * @Date 2021/1/7 0:31
 * @Created by youfayang
 */
public class LC338_CountingBits {
    public int[] countBits(int num) {
        int[] ret = new int[num+1];
        for (int i = 1; i <= num; i++) {
             ret[i] = ret[i&(i-1)]+1;
        }
        return ret;
    }
}
