// 572. Subtree of Another Tree
// Easy
// 7.1K
// 404
// Companies
// Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.

// A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.

 

// Example 1:


// Input: root = [3,4,5,1,2], subRoot = [4,1,2]
// Output: true
// Example 2:


// Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
// Output: false
 

// Constraints:

// The number of nodes in the root tree is in the range [1, 2000].
// The number of nodes in the subRoot tree is in the range [1, 1000].
// -104 <= root.val <= 104
// -104 <= subRoot.val <= 104

// Long ass solution, supposed to be fast
class Solution {
    private boolean isSubTreeFlag = false;
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            if ( t == null ) return true;
            return false;
        }

        dfs(s, t);

        return isSubTreeFlag;
    }
    private void dfs(TreeNode s, TreeNode t) {
        if (s == null) return;

        dfs(s.left, t);
        if (isSameTree(s, t)) {
            isSubTreeFlag = true;
            return;
        }
        dfs(s.right, t);
    }
    private boolean isSameTree(TreeNode s, TreeNode t) {
        if ( s == null) {
            if ( t == null) return true;
            else return false;
        }
        if (s.left == null && s.right == null) {
            if (t.left == null && t.right == null && s.val == t.val) return true;
            else return false;
        } else if (s.left != null && s.right == null) {
            if (t.left != null && t.right == null && s.val == t.val) return isSameTree(s.left, t.left);
            else return false;
        } else if (s.left == null && s.right != null) {
            if(t.left == null && t.right != null && s.val == t.val) return isSameTree(s.right, t.right);
            else return false;
        } else {
            if (t.left != null && t.right != null && s.val == t.val) return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
            else return false;                   
        }
    }
}


// Fast solution
class Solution {
    public boolean isSubTree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        if (isSameTree(root, subRoot)) {
            return true;
        }
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.val != subRoot.val) {
            return false;
        }
        return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);
    }
}

// ChatGPT Solution Use this solution
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return t == null;
        }
        if (isSameTree(s, t)) {
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}