package medium.stackQueue;

/**
 * @Classname LC739_DailyTemperatures
 * @Description TODO 用栈实现。
 * 题目：数组元素中下一个比他大的元素距离
 * 解法1:1.
 * @Date 2021/1/2 16:19
 * @Created by youfayang
 */
public class LC739_DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        if(T == null)return null;
        int size = T.length;
        int[] D = new int[size];
        for (int i = 0; i < T.length-1; i++) {
            for (int j = i+1; j < T.length; j++) {
                if (T[j]>T[i]){
                    D[i] = j-i;
                    break;
                }
            }
        }
        return D;
    }
}
