package easy.binarytree;

import javax.imageio.event.IIOReadProgressListener;

/**
 * @Classname LC235_LowestCommonAncestorofaBinarySearchTree
 * @Description TODO
 * 题目：寻找二叉搜索树两个节点的公共祖先
 * 解法1:1.
 * @Date 2020/12/26 11:21
 * @Created by youfayang
 */
public class LC235_LowestCommonAncestorofaBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val){
            TreeNode temp = p;
            p = q;
            q = temp;
        }
        if (p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right,p,q);
        }else if (p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left,p,q);
        }else{// if (p.val <= root.val && q.val >= root.val){
            return root;
        }

    }
}
