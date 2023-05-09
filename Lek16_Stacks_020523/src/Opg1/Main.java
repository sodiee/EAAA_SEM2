package Opg1;

public class Main {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();

        arrayStack.push(1);
        arrayStack.push(4);
        arrayStack.push(8);
        arrayStack.push(10);
        System.out.println(arrayStack);
        arrayStack.pop();
        System.out.println(arrayStack);
        System.out.println(arrayStack.peek());
    }
}
