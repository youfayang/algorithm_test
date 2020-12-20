package easy.binarytree;

/**
 * @Classname TreeNode
 * @Description 树
 * @Date 2020/12/20 15:28
 * @Created by youfayang
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
      }
}
