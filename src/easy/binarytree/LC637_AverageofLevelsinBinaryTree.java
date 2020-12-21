package easy.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Classname LC637_AverageofLevelsinBinaryTree
 * @Description TODO
 * 题目：给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
 * 解法1:1.
 * @Date 2020/12/21 21:53
 * @Created by youfayang
 */
public class LC637_AverageofLevelsinBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if (root == null)return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                 sum += cur.val;
                 if (cur.left != null)queue.add(cur.left);
                 if (cur.right != null)queue.add(cur.right);
            }
            res.add(sum/size);
        }
        return res;
    }
}
