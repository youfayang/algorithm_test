package medium.binarytree;

import easy.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Classname LC230_KthSmallestElementinaBST
 * @Description TODO
 * 题目：给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
 * 解法1:1.
 * @Date 2020/12/23 21:45
 * @Created by youfayang
 */
public class LC230_KthSmallestElementinaBST {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> sortList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            sortList.add(node.val);
            if (sortList.size() == k){
                return node.val;
            }
            cur = node.right;
        }
        return sortList.get(k);
    }
}
