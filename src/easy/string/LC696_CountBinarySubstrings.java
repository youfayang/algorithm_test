package easy.string;

/**
 * @Classname LC696_CountBinarySubstrings
 * @Description TODO 优化执行用时
 * 题目：计数二进制子串
 * 解法1:1.
 * @Date 2021/1/2 19:50
 * @Created by youfayang
 */
public class LC696_CountBinarySubstrings {
    private int cnt = 0;
    public int countBinarySubstrings(String s) {
        for(int i = 0; i<s.length();i++){
            leftZeroRightOne(s,i,i+1);
            leftOneRightZero(s,i,i+1);
        }
        return cnt;
    }

    private void leftOneRightZero(String str, int s, int e) {
        while (s >=0 && e < str.length()
                && str.charAt(s) == '1' && str.charAt(e) == '0'){
            s--;
            e++;
            cnt++;
        }
    }

    private void leftZeroRightOne(String str, int s, int e) {
        while (s >=0 && e < str.length()
                && str.charAt(s) == '0' && str.charAt(e) == '1'){
            s--;
            e++;
            cnt++;
        }
    }
}
