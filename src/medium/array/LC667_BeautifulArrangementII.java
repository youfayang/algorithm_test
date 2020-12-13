package medium.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Classname LC667_BeautifulArrangementII
 * @Description TODO
 * 题目：给定两个整数n和k，你需要实现一个数组，这个数组包含从1到n的n个不同整数，同时满足以下条件：
 * ① 如果这个数组是 [a1, a2, a3, ... , an] ，那么数组[|a1 - a2|, |a2 - a3|, |a3 - a4|, ... , |an-1 - an|] 中应该有且仅有k 个不同整数；.
 * ② 如果存在多种答案，你只需实现并返回其中任意一种.
 * 解法1:参考答案，使用翻转
 * @Date 2020/12/12 19:33
 * @Created by youfayang
 */
public class LC667_BeautifulArrangementII {
    public static void main(String[] args) {
        int[] res = constructArray(10,3);
        System.out.println(Arrays.toString(res));
    }
    public static int[] constructArray(int n, int k) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i+1;
        }
        if (k == 1){
            return result;
        }
        for (int i = 1; i< k; i++){
            int mid = i+(n-i)/2;
            for (int left = i,right = n-1; left <= mid; left++,right--) {
                int tmp = result[left];
                result[left] = result[right];
                result[right] = tmp;
            }
        }
        return result;
    }
}
