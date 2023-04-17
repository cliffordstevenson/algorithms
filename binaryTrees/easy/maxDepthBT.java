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