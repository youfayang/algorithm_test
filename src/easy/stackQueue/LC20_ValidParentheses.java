package easy.stackQueue;

import java.util.Stack;

/**
 * @Classname LC20_ValidParentheses
 * @Description TODO 改成针对字符的操作
 * 题目：用栈实现括号匹配
 * 解法1:1.
 * @Date 2021/1/2 15:36
 * @Created by youfayang
 */
public class LC20_ValidParentheses {
    public static void main(String[] args) {
        isValid("()");
    }
    public static boolean isValid(String s) {
        if (s == null || "".equals(s))return true;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String c = s.charAt(i)+"";
            if ("([{".contains(c)){
                stack.push(c);
            }else if (")".equals(c)){
                if (stack.isEmpty() || !(stack.pop().equals("("))){
                    return false;
                }
            }else if ("]".equals(c)){
                if (stack.isEmpty() || !(stack.pop().equals("["))){
                    return false;
                }
            }else if ("}".equals(c)){
                if (stack.isEmpty() || !(stack.pop().equals("{"))){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
