package medium.binarytree;

import easy.binarytree.TreeNode;

import java.util.*;

/**
 * @Classname LC145_BinaryTreePostorderTraversal
 * @Description TODO
 * 题目：后序遍历
 * 解法1:1.
 * @Date 2020/12/23 20:36
 * @Created by youfayang
 */
public class LC145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.empty()){
            TreeNode cur = stack.pop();
            if (cur == null) continue;
            res.add(cur.val);
            stack.add(cur.left);
            stack.add(cur.right);
        }
        Collections.reverse(res);
        return res;
    }
}
