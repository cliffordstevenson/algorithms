// 100. Same Tree
// Easy
// 9.2K
// 186
// Companies
// Given the roots of two binary trees p and q, write a function to check if they are the same or not.

// Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 

// Example 1:


// Input: p = [1,2,3], q = [1,2,3]
// Output: true
// Example 2:


// Input: p = [1,2], q = [1,null,2]
// Output: false
// Example 3:


// Input: p = [1,2,1], q = [1,1,2]
// Output: false
 

// Constraints:

// The number of nodes in both trees is in the range [0, 100].
// -104 <= Node.val <= 104

// time complexity: O(n); n is the number of nodes in the tree

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // base case
        // recursive functions must have a base case
        // binary tree questions are almost always recursive
        // an empty tree, is the same as an empty tree
        if(p == null && q == null) {
            return true;
            // this checks if one of the trees is empty, and the other is 
            // not, by using the XOR operator, instead of using an && operator
        } else if(p == null || q == null) {
            return false;
            // now this checks the values of the nodes, if they are not equal
            // then the trees are not the same
        } else if(p.val != q.val) {
            return false;
            // verify that the left node's subtree is the same AND
            // the right node's subtree is the same. The recursion
            // will handle it from there regardless of the size of the tree
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}