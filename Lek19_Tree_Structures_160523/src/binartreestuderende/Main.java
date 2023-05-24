package binartreestuderende;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> n15 = new BinaryTree<>(15);
        BinaryTree<Integer> n11 = new BinaryTree<>(11, null, n15);

        BinaryTree<Integer> n25 = new BinaryTree<>(25);
        BinaryTree<Integer> n30 = new BinaryTree<>(30, n25, null);

        BinaryTree<Integer> n22 = new BinaryTree<>(22, n11, n30);

        BinaryTree<Integer> n88 = new BinaryTree<>(88);
        BinaryTree<Integer> n90 = new BinaryTree<>(90, n88, null);
        BinaryTree<Integer> n77 = new BinaryTree<>(77, null, n90);

        BinaryTree<Integer> n45 = new BinaryTree<>(45, n22, n77);


        System.out.println(n45.size());

        System.out.println(n45.height());
        n45.preOrder();
        System.out.println();
        n45.inOrder();
        System.out.println();
        n45.postOrder();
        System.out.println();
        System.out.println(n45.sum());
    }
}
