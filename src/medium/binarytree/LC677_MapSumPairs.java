package medium.binarytree;

/**
 * @Classname LC677_MapSumPairs
 * @Description TODO
 * 题目：实现一个 Trie，用来求前缀和
 * 解法1:1.
 * @Date 2021/1/1 21:03
 * @Created by youfayang
 */
public class LC677_MapSumPairs {
    class MapSum {
        private class Node{
            Node[] childs = new Node[26];
            int val = 0;
        }
        private Node root = new Node();
        /** Initialize your data structure here. */
        public MapSum() {
        }

        public void insert(String key, int val) {
            insert(root,key,val);
        }

        private void insert(Node node, String key, int val) {
            if (node == null) return;
            if (key.length() == 0){
                node.val = val;
                return;
            }
            int index = indexForChar(key.charAt(0));
            if (node.childs[index] == null){
                node.childs[index] = new Node();
            }
            insert(node.childs[index],key.substring(1),val);
        }

        private int indexForChar(char charAt) {
            return charAt - 'a';
        }

        public int sum(String prefix) {
            return sum(root,prefix);
        }

        private int sum(Node node, String prefix) {
            if (node == null)return 0;
            if (prefix == null || prefix.length() == 0){
                // 前缀的子树
                int sum = node.val;
                Node[] childs = node.childs;
                for (Node child : childs) {
                    sum += sum(child,prefix);
                }
                return sum;
            } else {
                // 继续搜索前缀
                int index = indexForChar(prefix.charAt(0));
                return sum(node.childs[index],prefix.substring(1));
            }
        }
    }

}
