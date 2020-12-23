package medium.binarytree;

import easy.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Classname LC144_BinaryTreePreorderTraversal
 * @Description TODO
 * 题目：前序遍历
 * 解法1:1.
 * @Date 2020/12/23 19:57
 * @Created by youfayang
 */
public class LC144_BinaryTreePreorderTraversal {
    private List<Integer> res = new ArrayList<>();

    /**
     * 递归实现
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null){
            return res;
        }
        res.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return res;
    }

    /**
     * 栈实现
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> res2 = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode r = stack.pop();
            if (r == null)continue;
            res2.add(r.val);
            stack.push(r.right);
            stack.push(r.left);
        }
        return res2;
    }
}
