package binarysearchtreestuderende;

public class App {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.add(45);
        bst.add(22);
        bst.add(11);
        bst.add(15);
        bst.add(30);
        bst.add(25);
        bst.add(77);
        bst.add(90);
        bst.add(88);
        bst.print();

        System.out.println(bst.findMax());
        System.out.println(bst.findMin());
        System.out.println();

        for (int i = 0; i < 9; i++) {
            bst.print();
            System.out.println(bst.removeMin());
        }
        System.out.println("til slut: ");
        bst.print();


    }
}
