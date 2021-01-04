package easy.bit;

/**
 * @Classname LC693_BinaryNumberwithAlternatingBits
 * @Description TODO
 * 题目：不会出现连续的0或者1
 * 解法1:1.
 * @Date 2021/1/4 21:41
 * @Created by youfayang
 */
public class LC693_BinaryNumberwithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        //右移一位，与原数取异或，得到全为1的数
        int a = n ^ (n >> 1);
        return (a & (a+1)) == 0;
    }
}
