package easy.string;

/**
 * @Classname LC409_LongestPalindrome
 * @Description TODO
 * 题目：
 * 解法1:1.
 * @Date 2021/1/2 18:45
 * @Created by youfayang
 */
public class LC409_LongestPalindrome {

    public int longestPalindrome(String s) {
        int[] cnt = new int[52];
        for (char c : s.toCharArray()) {
            if ('a'<= c && c <= 'z'){
                cnt[c-'a']++;
            }else {
                cnt[c-'A'+26]++;
            }
        }
        int exitSin = 0;
        int res = 0;
        for (int i : cnt) {
            if (i%2 == 0){
                res += i;
            }else {
                exitSin = 1;
                res += i/2;
            }
        }
        return res+exitSin;
    }
}
