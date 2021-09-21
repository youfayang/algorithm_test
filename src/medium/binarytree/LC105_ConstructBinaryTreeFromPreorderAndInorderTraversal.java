package medium.binarytree;

import easy.binarytree.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: idea
 * @description: 从前序和中序遍历中构造二叉树
 * @author: youfayang
 * @Date: 2021/09/21 16:53
 **/
public class LC105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> inMap = new HashMap<>(16);
        for (int i = 0; i < inorder.length; i++) {
            int val = inorder[i];
            inMap.put(val,i);
        }
        return buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1, inMap);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer,Integer> inMap) {
        if (preStart > preEnd || inStart > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);
        int index = inMap.get(preorder[preStart]);
        int numsLeft = index-inStart;
        root.left = buildTree(preorder,preStart+1,preStart+numsLeft,inorder,inStart,inStart+numsLeft-1,inMap);
        root.right = buildTree(preorder,preStart+numsLeft+1,preEnd,inorder,inStart+numsLeft+1,inEnd,inMap);
        return root;
    }
}
