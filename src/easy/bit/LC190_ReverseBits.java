package easy.bit;

/**
 * @Classname LC190_ReverseBits
 * @Description TODO
 * 题目：翻转一个数的bit位
 * 解法1:1.
 * @Date 2021/1/4 21:10
 * @Created by youfayang
 */
public class LC190_ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ret = 0;
        int i = 0;
        while(i++ < 32){
            ret = ret << 1;
            if ( (n & 1) == 1){
                ret = ret +1;
            }
            n = n >>> 1;
        }
        return ret;
    }
}
