package easy.string;

/**
 * @Classname LC9_PalindromeNumber
 * @Description TODO
 * 题目：判断一个整数是否是回文数
 * 解法1:1.
 * @Date 2021/1/2 19:32
 * @Created by youfayang
 */
public class LC9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x<0 || (x > 0 && (x % 10 == 0))){
            return false;
        }
        if (x<10){
            return true;
        }
        int right = 0;
        while (right < x){
            right = right*10 + x%10;
            x = x/10;
        }
        return x == right || right/10 == x;
    }
}
