package hard.binarytree;

import easy.binarytree.TreeNode;

/**
 * @program: idea
 * @description: 二叉树的最大路径和
 * @author: youfayang
 * @Date: 2021/09/21 16:14
 **/
public class LC124_BinaryTreeMaximumPathSum {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        oneSideMax(root);
        return ans;
    }

    private int oneSideMax(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(0,oneSideMax(root.left));
        int right = Math.max(0,oneSideMax(root.right));
        ans = Math.max(ans,left + right + root.val);
        return Math.max(left,right)+root.val;
    }
}
