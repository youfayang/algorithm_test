package easy.bit;

/**
 * @Classname LC342_PowerofFour
 * @Description TODO
 * 题目：4的n次方
 * 解法1:1.
 * @Date 2021/1/4 21:34
 * @Created by youfayang
 */
public class LC342_PowerofFour {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & ( n - 1)) == 0
                && (n & 0b01010101010101010101010101010101) == n;
    }
}
