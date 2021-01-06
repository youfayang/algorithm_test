package medium.bit;

/**
 * @Classname LC318_MaximumProductofWordLengths
 * @Description TODO
 * 题目：最大单词长度乘积
 * 解法1:1.
 * @Date 2021/1/6 21:53
 * @Created by youfayang
 */
public class LC318_MaximumProductofWordLengths {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] w = new int[n];
        //remark 用整数标识一个字符串中的字符有没有出现过。
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (char c : word.toCharArray()) {
                w[i] |= 1<<(c-'a');
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < w.length-1; i++) {
            int i1 = w[i];
            for (int j = i+1; j < w.length; j++) {
                int i2 = w[j];
                if ((i1 & i2) == 0) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
}
