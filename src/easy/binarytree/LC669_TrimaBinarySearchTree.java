package easy.binarytree;

/**
 * @Classname LC669_TrimaBinarySearchTree
 * @Description TODO
 * 题目：修剪二叉搜索树
 * 解法1:1.
 * @Date 2020/12/23 21:36
 * @Created by youfayang
 */
public class LC669_TrimaBinarySearchTree {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null){
            return null;
        }
        if (root.val < low){
            return trimBST(root.right,low,high);
        }else if (root.val > high){
            return trimBST(root.left,low,high);
        }else {
            root.left = trimBST(root.left,low,high);
            root.right = trimBST(root.right,low,high);
            return root;
        }
    }
}
