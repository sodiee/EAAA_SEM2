package binarysearchtreestuderende;

public class App {
    public static void main(String[] args) {
        /*
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
*/

        DictionaryBST<Integer, Integer> dictionaryBST = new DictionaryBST<>();


        dictionaryBST.put(6, 45);
        dictionaryBST.put(1, 11);
        dictionaryBST.put(2, 15);
        dictionaryBST.put(3, 22);
        dictionaryBST.put(4, 25);
        dictionaryBST.put(5, 30);
        dictionaryBST.put(7, 77);
        dictionaryBST.put(8, 88);
        dictionaryBST.put(9, 90);

        dictionaryBST.print();

    }
}
