package medium.binarytree;

/**
 * @Classname LC208_ImplementTrie_PrefixTree
 * @Description TODO
 * 题目：实现字典树
 * 解法1:1.
 * @Date 2021/1/1 20:37
 * @Created by youfayang
 */
public class LC208_ImplementTrie_PrefixTree {
    class Trie {
        private class Node{
            Node[] childs = new Node[26];
            boolean isLeaf;
        }
        private Node root = new Node();

        /** Initialize your data structure here. */
        public Trie() {
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            insert(word,root);
        }

        private void insert(String word, Node node) {
            if (node == null)return;
            if (word.length() == 0){
                node.isLeaf = true;
                return;
            }
            int index = indexForChar(word.charAt(0));
            if(node.childs[index] == null){
                node.childs[index] = new Node();
            }
            insert(word.substring(1),node.childs[index]);
        }

        private int indexForChar(char c) {
            return c-'a';
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            return search(word,root);
        }

        private boolean search(String word, Node node) {
            if(node == null)return false;
            if (word.length() == 0)return node.isLeaf;
            int index = indexForChar(word.charAt(0));
            return search(word.substring(1),node.childs[index]);
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            return startsWith(prefix,root);
        }

        private boolean startsWith(String prefix, Node node) {
            if (node == null)return false;
            if (prefix.length() == 0) return true;
            int index = indexForChar(prefix.charAt(0));
            return startsWith(prefix.substring(1),node.childs[index]);
        }
    }


}
