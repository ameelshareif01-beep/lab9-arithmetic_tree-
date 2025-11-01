public class BinaryTreeNode {
    String value; // Can be an operator "+" or an operand "3"
    BinaryTreeNode parent;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(String value) {
        this.value = value;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    /**
     * Performs a preorder traversal starting from this node.
     * (Visit Parent, then Left, then Right)
     * This outputs Prefix notation.
     */
    public void traversePreorder() {
        // 1. Print this node's value
        System.out.print(this.value + " ");

        // 2. Recursively call on left child
        if (this.left != null)
            this.left.traversePreorder();

        // 3. Recursively call on right child
        if (this.right != null)
            this.right.traversePreorder();
    }

    /**
     * Performs an inorder traversal starting from this node.
     * (Visit Left, then Parent, then Right)
     * This outputs Infix notation with parentheses.
     */
    public void traverseInorder() {
        // (Optional) Print "(" before left traversal
        if (this.left != null) {
            System.out.print("(");
            this.left.traverseInorder();
        }

        // 2. Print this node's value
        System.out.print(this.value);

        // 3. Recursively call on right child
        if (this.right != null) {
            this.right.traverseInorder();
            System.out.print(")");
        }
    }

    /**
     * Performs a postorder traversal starting from this node.
     * (Visit Left, then Right, then Parent)
     * This outputs Postfix (RPN) notation.
     */
    public void traversePostorder() {
        // 1. Left
        if (this.left != null)
            this.left.traversePostorder();

        // 2. Right
        if (this.right != null)
            this.right.traversePostorder();

        // 3. Parent
        System.out.print(this.value + " ");
    }
}
