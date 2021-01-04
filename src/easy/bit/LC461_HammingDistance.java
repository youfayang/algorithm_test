package easy.bit;

/**
 * @Classname LC461_HammingDistance
 * @Description TODO
 * 题目：统计两个二进制数有多少位不同
 * 解法1:1.
 * @Date 2021/1/4 20:43
 * @Created by youfayang
 */
public class LC461_HammingDistance {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);

    }
}
