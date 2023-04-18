// 104. Maximum Depth of Binary Tree
// Easy

// 10516

// 168

// Add to List

// Share
// Given the root of a binary tree, return its maximum depth.

// A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 

// Example 1:


// Input: root = [3,9,20,null,null,15,7]
// Output: 3
// Example 2:

// Input: root = [1,null,2]
// Output: 2
 

// Constraints:

// The number of nodes in the tree is in the range [0, 104].
// -100 <= Node.val <= 100

class Solution {
    public int maxDepth(TreeNode root) {
        // We're returning an int, so we can't return null
        if(root == null) {
            return 0;
        }

        // this recursive functon is gonna keep going until it 
        // hits the bottom of the tree
        // if one of the left or right nodes is null, it will return 0
        // and continue on the next pass to the bottom of the tree
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        // Math.max() returns the larger of the two values
        return Math.max(left, right) + 1;
    }
}

// The maxDepth method is recursively called on the left and right 
// subtrees of the current node separately, so it essentially traverses 
// the entire tree from the root to the leaf nodes in a depth-first 
// manner.

// The recursion goes all the way to the bottom of the left subtree 
// before the right subtree is processed. When the recursion reaches 
// a null node (i.e., a leaf node), it stops and returns a depth of 0 
// for that subtree. Then, the recursion unwinds, and the maximum depth 
// of the left and right subtrees is computed using the Math.max(left, 
// right) + 1 expression, as mentioned earlier. The + 1 part of the 
// expression accounts for the current node, which is at a depth of 1 
// relative to the depth of its children.