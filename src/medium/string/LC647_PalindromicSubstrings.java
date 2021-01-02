package medium.string;

/**
 * @Classname LC647_PalindromicSubstrings
 * @Description TODO
 * 题目：回文子字符串的个数
 * 解法1:1.
 * @Date 2021/1/2 19:19
 * @Created by youfayang
 */
public class LC647_PalindromicSubstrings {
    private int cnt = 0;
    public int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
             extendString(s,i,i);
             extendString(s,i,i+1);
        }
        return cnt;
    }

    private void extendString(String s, int start, int end) {
        while(start >= 0 && end <s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
            cnt++;
        }
    }
}
