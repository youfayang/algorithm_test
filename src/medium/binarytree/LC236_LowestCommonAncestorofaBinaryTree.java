package medium.binarytree;

import easy.binarytree.TreeNode;

/**
 * @Classname LC236_LowestCommonAncestorofaBinaryTree
 * @Description TODO
 * 题目：二叉树的最近公共祖先
 * 解法1:1.
 * remark 不是很理解return left == null ? right : right == null ? left : root;
 * (flson &&frson)((x=p∣∣x=q)&&(flson∣∣frson ))
 * @Date 2020/12/26 13:46
 * @Created by youfayang
 */
public class LC236_LowestCommonAncestorofaBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q )return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        return left == null ? right : right == null ? left : root;
    }
}
