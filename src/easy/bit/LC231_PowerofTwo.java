package easy.bit;

/**
 * @Classname LC231_PowerofTwo
 * @Description TODO
 * 题目：判断一个数是否是2的n次方
 * 解法1:1.
 * @Date 2021/1/4 21:26
 * @Created by youfayang
 */
public class LC231_PowerofTwo {
    public boolean isPowerOfTwo(int n) {
//        return n > 0 && Integer.bitCount(n) ==1;
        return n > 0 && ((n & (n -1)) == 0);
    }
}
