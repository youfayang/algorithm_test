package easy.string;

/**
 * @Classname LC242_ValidAnagram
 * @Description TODO
 * 题目：字母异位词
 * 解法1:1.
 * @Date 2021/1/2 18:39
 * @Created by youfayang
 */
public class LC242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c-'a']++;
        }
        for (char c : t.toCharArray()) {
            cnt[c-'a']--;
        }
        for (int i : cnt) {
            if (i != 0){
                return false;
            }
        }
        return true;
    }
}
