package Opg2;

public class Main {
    public static void main(String[] args) {
        NodeStack nodeStack = new NodeStack();
        nodeStack.push(1);
        nodeStack.push(5);
        nodeStack.push(6);
        nodeStack.push(9);
        nodeStack.udskrivElements();
        nodeStack.pop();
        System.out.println();
        nodeStack.udskrivElements();

        System.out.println(nodeStack.peek());
    }
}
