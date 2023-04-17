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
    // flag value initialized because the height of an empty tree is -1
    // If the 'dfs' method returns a value that is not equal to -1
    // then the tree is balanced
    final int UNBALANCED = -1;
    public boolean isBalanced(TreeNode root) {
        // If the root node is null, its balanced
        // An empty node is a balanced binary tree
        if(root == null) return true;
        // If the root is NOT NULL, the isBalanced public function
        // Calls the private dfs function, which is private 
        // to the isBalanced function
        return dfs(root) != UNBALANCED;
    }
    private int dfs(TreeNode root) {
        // base case: leaf node
        // this line checks if the root node has no children
        // as this is a bottom up approach, so it counts the height
        // from the bottom up. If the root node has no children, 
        // from the bottom, this means it has a height of 1
        if(root.left == null && root.right == null) return 1;

        // These functions start on the left bottom node, and then
        // work their way to the right. If the right node has children,
        // it recursively calls the dfs function, and then checks, those
        // left and right children before

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
        // returns absolute value of the difference between the left 
        // and right subtree. The reason we use the abs function is 
        // because that while, it's not strictly necessary as this binary
        // tree will never have a negative height, it's good practice
        // because when calculating the distance between anything,
        // including these nodes, a positive value must always represent
        // that value, so it's good practice to use the abs function
        // also there is no other built-in java function that does this,
        // we would have to write our own function to do this, so abs
        // is best practice without exception
        if(Math.abs(rightH - leftH) <= 1) return Math.max(rightH, leftH) + 1;
        // finally, this unbalanced calls isBalanced, which is the
        // public function, and returns false or true
        return UNBALANCED;
    }
}



