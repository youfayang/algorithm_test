package easy.bit;

/**
 * @Classname LC_371_SumofTwoIntegers
 * @Description TODO
 * 题目：
 * 解法1:1.
 * @Date 2021/1/6 21:43
 * @Created by youfayang
 */
public class LC_371_SumofTwoIntegers {
    public int getSum(int a, int b) {
        return b == 0 ? a:getSum(a^b,(a&b)<<1);
    }
}
