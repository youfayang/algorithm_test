package easy.string;

import java.util.Map;

/**
 * @Classname LC205_IsomorphicStrings
 * @Description TODO
 * 题目：同构字符串
 * 解法1:1.
 * @Date 2021/1/2 19:02
 * @Created by youfayang
 */
public class LC205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] indexS = new int[256];
        int[] indexT = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (indexS[sc] != indexT[tc]){
                return false;
            }
            //避免初始0的干扰
            indexT[tc] = i+1;
            indexS[sc] = i+1;
        }
        return true;
    }
}
