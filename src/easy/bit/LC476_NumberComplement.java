package easy.bit;

/**
 * @Classname LC476_NumberComplement
 * @Description TODO
 * 题目：求一个数的补码
 * 解法1:1.
 * @Date 2021/1/4 21:46
 * @Created by youfayang
 */
public class LC476_NumberComplement {
    public int findComplement(int num) {
        int temp = num;
        int n = 0;
        while (temp != 0){
            n++;
            temp = temp >> 1;
        }
        return ((1 << n) - 1) ^ num;
    }
}
