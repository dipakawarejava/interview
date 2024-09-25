package com.interview.question.five;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class BinaryTree {
    TreeNode root;

    public void findMaximumValue() {
        int max = findMax(root);
        System.out.println("Maximum value in the tree: " + max);
    }

    private int findMax(TreeNode node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = findMax(node.left);
        int rightMax = findMax(node.right);

        return Math.max(node.val, Math.max(leftMax, rightMax));
    }

    public void calculateTreeDepth() {
        int depth = calculateDepth(root);
        System.out.println("Depth of the tree: " + depth);
    }

    private int calculateDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = calculateDepth(node.left);
        int rightDepth = calculateDepth(node.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(5);
        tree.root.left = new TreeNode(3);
        tree.root.right = new TreeNode(2);
        tree.root.left.left = new TreeNode(10);
        tree.root.left.right = new TreeNode(11);

        tree.findMaximumValue();
        tree.calculateTreeDepth();
    }
}