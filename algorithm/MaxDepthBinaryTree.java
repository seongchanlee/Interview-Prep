class MaxDepthBinaryTree {
  /*
   * https://leetcode.com/problems/maximum-depth-of-binary-tree/
   */ 

  public int maxDepth(TreeNode root) {
    // if given node is just a null node
    if (root == null) {
      return 0;
    }

    // if given node is a leaf node
    // (no left or right child)
    if (root.left == null && root.right == null) {
      return 1;
    }

    // recursively find the maximum depth for each left and right child
    int leftDepth = maxDepth(root.left);
    int rightDepth = maxDepth(root.right);

    // compare and return the max depth
    if (leftDepth > rightDepth) {
      return leftDepth;
    } else {
      return rightDepth;
    }
  }
}
