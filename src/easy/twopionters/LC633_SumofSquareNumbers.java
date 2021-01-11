package easy.twopionters;

/**
 * @Classname LC633_SumofSquareNumbers
 * @Description TODO
 * 题目：两数平方和
 * 解法1:1.
 * @Date 2021/1/11 21:54
 * @Created by youfayang
 */
public class LC633_SumofSquareNumbers {
    public boolean judgeSquareSum(int c) {
        if(c == 0) return true;
        int s = 0;
        int e =  (int) Math.sqrt(c);
        while (s <= e){
            int cur = s*s+e*e;
            if (cur == c){
                return true;
            }else if (cur < c){
                s++;
            }else if (cur > c){
                e--;
            }
        }
        return false;
    }
}
