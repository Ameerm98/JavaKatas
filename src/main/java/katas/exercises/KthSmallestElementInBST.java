package katas.exercises;

/**
 * Kth Smallest Element in a Binary Search Tree
 *
 * Given a BST, write a function to find the Kth smallest element.
 *
 * Example:
 *
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *
 * The 3rd smallest element is 4.
 *
 * Expected time complexity is O(n), while n is the tree height.
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 */
public class KthSmallestElementInBST {

    private static int count = 0;
    private static int result = -1;

    public static int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        count = 0;
        return result;
    }

    private static void inorder(TreeNode node, int k) {
        if (node == null || count >= k) {
            return;
        }

        // Traverse the left subtree
        inorder(node.left, k);

        // Visit the current node
        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        // Traverse the right subtree
        inorder(node.right, k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        int k = 3;
        int kthSmallestValue = kthSmallest(root, k);
        System.out.println("The " + k + "rd smallest element is: " + kthSmallestValue); // Output: 4
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
