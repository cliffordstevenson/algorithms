// 226. Invert Binary Tree
// Easy

// 12001

// 170

// Add to List

// Share
// Given the root of a binary tree, invert the tree, and return its root.

 

// Example 1:


// Input: root = [4,2,7,1,3,6,9]
// Output: [4,7,2,9,6,3,1]
// Example 2:


// Input: root = [2,1,3]
// Output: [2,3,1]
// Example 3:

// Input: root = []
// Output: []
 

// Constraints:

// The number of nodes in the tree is in the range [0, 100].
// -100 <= Node.val <= 100

// This is a recursive solution, often Binary Tree problems
// can be solved recursively

// recursive function to not happen top to bottom like a loop
// they happen bottom to top, so they are called many times
// but they are called in a stack, so they are called in a
// LIFO order (last in first out)

class Solution {
    public TreeNode invertTree(TreeNode root) {
        // return the null root because it's already inverted.
        if (root == null) {
            return root;
        }
        
        // we give each variable a name for the left and 
        // right child TreeNodes of the root
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        
        // Java can access the nodes of the tree to the left and right
        root.right = left;
        root.left = right;
        
        return root;
    }
}