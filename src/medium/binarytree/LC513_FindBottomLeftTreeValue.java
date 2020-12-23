package medium.binarytree;

import easy.binarytree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname LC513_FindBottomLeftTreeValue
 * @Description TODO
 * 题目：给定一个二叉树，在树的最后一行找到最左边的值。
 * 解法1:1.
 * @Date 2020/12/23 19:31
 * @Created by youfayang
 */
public class LC513_FindBottomLeftTreeValue {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        int res = findBottomLeftValue(root);
    }
    public static int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode bottomLeft = null;
        while (!queue.isEmpty()){
            int cnt = queue.size();
            for (int i = 0; i < cnt; i++) {
                TreeNode cur = queue.poll();
                 if (i == 0){
                     bottomLeft = cur;
                 }
                 if (cur.left != null){
                     queue.add(cur.left);
                 }
                 if (cur.right != null){
                     queue.add(cur.right);
                 }
            }
        }
        return bottomLeft.val;
    }
}
