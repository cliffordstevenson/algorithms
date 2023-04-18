// 543. Diameter of Binary Tree
// Easy

// 11112

// 698

// Add to List

// Share
// Given the root of a binary tree, return the length of the diameter of the tree.

// The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

// The length of a path between two nodes is represented by the number of edges between them.

 

// Example 1:


// Input: root = [1,2,3,4,5]
// Output: 3
// Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
// Example 2:

// Input: root = [1,2]
// Output: 1
 

// Constraints:

// The number of nodes in the tree is in the range [1, 104].
// -100 <= Node.val <= 100



class Solution {
    // This is sort of a stupid concept, but it's a good way to think about
    // initializing a variable to the smallest possible value
        int max = Integer.MIN_VALUE;
        public int diameterOfBinaryTree(TreeNode root) {
            dfs(root);
            return max;
        }
        private int dfs(TreeNode node) {
            // initializing left and right and setting them to 0
            if (node == null) {
                return 0;
            }
            
            // this means we run recursion until we hit a null node
            // while calculating the height of the tree from
            // that side
            int left = dfs(node.left);
            int right = dfs(node.right)
            // confusingly, we're not calculating the diameter here
            // we're calculating the max of the left and right
            // and that means we don't repeat edges, so the length
            // from 5 to 2 to 1 is 1, not 2; 

            // here we're calculating the max of the left and right
            // by comparing the sum to the stupid negative number
            // we set max to
            max = Math.max(max, left + right);
            
            // now we add one because we didn't count the root due
            // to our left and right operations
            return Math.max(left, right) + 1;
        }
    }
