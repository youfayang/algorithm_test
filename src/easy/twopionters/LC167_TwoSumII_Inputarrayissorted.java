package easy.twopionters;

/**
 * @Classname LC167_TwoSumII_Inputarrayissorted
 * @Description TODO
 * 题目：两数之和 II - 输入有序数组
 * 解法1:1.
 * @Date 2021/1/11 21:48
 * @Created by youfayang
 */
public class LC167_TwoSumII_Inputarrayissorted {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length - 1;
        while (s < e){
            int cur = numbers[s]+numbers[e];
            if (cur == target){
                return new int[]{s+1,e+1};
            }else if (cur < target){
                s++;
            }else if (cur > target){
                e--;
            }
        }
        return null;
    }
}
