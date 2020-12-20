package medium.binarytree;

import easy.binarytree.TreeNode;

/**
 * @Classname LC687_LongestUnivaluePath
 * @Description TODO
 * 题目：给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 * 解法1:1.remark 不会的题
 * @Date 2020/12/20 19:17
 * @Created by youfayang
 */
public class LC687_LongestUnivaluePath {
    int path = 0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return path;
    }

    private int dfs(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        //与根节点相同，左边的高度
        int leftPath = root.left != null && root.val == root.left.val ? left+1 : 0;
        //与根节点相同，右边的高度
        int rightPath = root.right != null && root.val == root.right.val ? right+1 : 0;
        //包含根节点在内的路径。
        path = Math.max(path,leftPath+rightPath);
        return Math.max(leftPath,rightPath);
    }


}
