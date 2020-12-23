package medium.binarytree;

import easy.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Classname LC94_BinaryTreeInorderTraversal
 * @Description TODO
 * 题目：非递归中序遍历
 * 解法1:1.
 * @Date 2020/12/23 20:50
 * @Created by youfayang
 */
public class LC94_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)return res;
        Stack<TreeNode> stack = new Stack<>();
        //cur指要遍历的树的根
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            //左子树根
            TreeNode treeNode = stack.pop();
            res.add(treeNode.val);
            //到右子树
            cur = treeNode.right;
        }
        return res;
    }
}
