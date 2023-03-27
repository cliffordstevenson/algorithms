// 110. Balanced Binary Tree
// Easy
// 8.6K
// 486
// Companies
// Given a binary tree, determine if it is 
// height-balanced
// .

 

// Example 1:


// Input: root = [3,9,20,null,null,15,7]
// Output: true
// Example 2:


// Input: root = [1,2,2,3,3,null,null,4,4]
// Output: false
// Example 3:

// Input: root = []
// Output: true
 

// Constraints:

// The number of nodes in the tree is in the range [0, 5000].
// -104 <= Node.val <= 104

class Solution {
    final int UNBALANCED = -1;
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return dfs(root) != UNBALANCED;
    }
    private int dfs(TreeNode root) {
        // base cas: leaf node
        if(root.left == null && root.right == null) return 1;

        // left subtree DFS
        int leftH = 0;
        if(root.left != null){
            leftH = dfs(root.left);
        }
        if(leftH == UNBALANCED) return UNBALANCED;

        // right Subtree DFS
        int rightH = 0;
        if(root.right != null) {
            rightH = dfs(root.right);
        }
        if(rightH == UNBALANCED) return UNBALANCED;

        // check current tree
        if(Math.abs(rightH - leftH) <= 1) return Math.max(rightH, leftH) + 1;
        return UNBALANCED;
    }
}



