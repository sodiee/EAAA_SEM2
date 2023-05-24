package binartreestuderende;

/**
 * A binary tree in which each node has two children.
 */
public class BinaryTree<E> {
    private Node root;

    /**
     * Constructs an empty tree.
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * Constructs a tree with one node and no children.
     *
     * @param rootData the data for the root
     */
    public BinaryTree(E rootData) {
        root = new Node();
        root.data = rootData;
        root.left = null;
        root.right = null;
    }

    /**
     * Constructs a binary tree.
     *
     * @param rootData the data for the root
     * @param left     the left subtree
     * @param right    the right subtree
     */
    public BinaryTree(E rootData, BinaryTree<E> left, BinaryTree<E> right) {
        root = new Node();
        root.data = rootData;
        if (left != null) {
            root.left = left.root;
        }
        if (right != null) {
            root.right = right.root;
        }
    }

    /**
     * Checks whether this tree is empty.
     *
     * @return true if this tree is empty
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Gets the data at the root of this tree.
     *
     * @return the root data
     */
    public E data() {
        return root.data;
    }

    /**
     * Gets the left subtree of this tree.
     *
     * @return the left child of the root
     */
    public BinaryTree<E> left() {
        BinaryTree<E> result = new BinaryTree<E>();
        result.root = root.left;
        return result;
    }

    /**
     * Gets the right subtree of this tree.
     *
     * @return the right child of the root
     */
    public BinaryTree<E> right() {
        BinaryTree<E> result = new BinaryTree<E>();
        result.root = root.right;
        return result;
    }

    /**
     * @param rootData the new data for the root
     * @return the data previous in the root
     */
    public E replace(E rootData) {
        E oldData = null;
        oldData = root.data;
        root.data = rootData;
        return oldData;
    }

    /**
     * @param n
     * @return true in n has no children
     */
    private boolean isLeaf(Node n) {
        return n.left == null && n.right == null;
    }

    /**
     * @param n
     * @return true in n has at least one child
     */
    private boolean isInternal(Node n) {
        return n.left != null || n.right != null;
    }

    /**
     * @return the number of nodes in the tree
     */
    public int size() {
        return size(root);
    }

    private int size(Node n) {
        if (n == null)
            return 0;
        else
            return (size(n.left) + 1 + size(n.right));
    }

    public int height() {
        return height(root);
    }

    private int height(Node n) {
        if (n == null) {
            return 0;
        } else {
            int lDybde = height(n.left);
            int rDybde = height(n.right);

            if (lDybde > rDybde) {
                return (lDybde + 1);
            } else {
                return (rDybde + 1);
            }
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node n) {
        //45 22 11 15 30 25 77 90 88
        if (n == null) {
            return;
        } else {
            System.out.println(n.data);
            preOrder(n.left);
            preOrder(n.right);
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node n) {
        //11 15 22 25 30 45 77 88 90
        //hvis den ik har noget til venstre,
        //så tager den sig selv først og derefter højre.
        //barnet til venstre er mindre end forælderen, men barnet på højreside er højere
        //derfor tager den sig selv før den til højre.
        if (n.left == null) {
            System.out.println(n.data);
            if (n.right != null) {
                inOrder(n.right);
            }
        } else {
            inOrder(n.left);
            System.out.println(n.data);
            if (n.right != null) {
                inOrder(n.right);
            }
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node n) {
        //15 11 25 30 22 88 90 77 45
        if (n.left != null) {
            postOrder(n.left);
        }
        if (n.right != null) {
            postOrder(n.right);
        }
        System.out.println(n.data);
    }

    public int sum() {
        return sum(root);
    }

    private int sum(Node n) {
        if (n == null)
            return 0;
        else
            return (int) n.data + (sum(n.left) + sum(n.right));
    }

    public boolean balanceret() {

        return false;
    }

    private class Node {
        public E data;
        public Node left;
        public Node right;

    }
}
