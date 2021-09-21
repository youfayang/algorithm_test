package medium.binarytree;

import easy.binarytree.TreeNode;

/**
 * @program: idea
 * @description: 恢复二叉搜索树
 * @author: youfayang
 * @Date: 2021/09/21 17:48
 **/
public class LC99_RecoverBinarySearchTree {
    static TreeNode errNode1,errNode2,preNode;
    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }
        errNode1 = errNode2 = preNode = null;
        findNode(root);
        int temp = errNode1.val;
        errNode1.val = errNode2.val;
        errNode2.val = temp;
    }

    private void findNode(TreeNode root) {
        if (root == null){
            return;
        }
        findNode(root.left);
        if (preNode != null && root.val<preNode.val){
            if (errNode1 == null){
                errNode1 = preNode;
            }
            errNode2 = root;
        }
        preNode = root;
        findNode(root.right);
    }
}
