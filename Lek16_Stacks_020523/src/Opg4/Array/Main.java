package Opg4.Array;

public class Main {
    public static void main(String[] args) {
        DropoutStackArray dropoutStackArray = new DropoutStackArray();
        dropoutStackArray.push(1);
        dropoutStackArray.push(0);
        dropoutStackArray.push(7);
        dropoutStackArray.push(5);
        dropoutStackArray.push(9);
        System.out.println(dropoutStackArray);
        dropoutStackArray.push(2);
        System.out.println(dropoutStackArray);
        dropoutStackArray.push(5);
        System.out.println(dropoutStackArray);
        dropoutStackArray.push(6);
        System.out.println(dropoutStackArray);
        dropoutStackArray.pop();
        System.out.println(dropoutStackArray);
        dropoutStackArray.push(6);
        System.out.println(dropoutStackArray);
        /*
        System.out.println(dropoutStackArray.getTop());
        dropoutStackArray.pop();
        System.out.println(dropoutStackArray.getTop());
        System.out.println(dropoutStackArray);

        dropoutStackArray.push(1);
        System.out.println(dropoutStackArray);
        dropoutStackArray.pop();
        dropoutStackArray.pop();
        dropoutStackArray.pop();
        System.out.println(dropoutStackArray);
        System.out.println(dropoutStackArray.getTop());
        dropoutStackArray.pop();
        System.out.println(dropoutStackArray);
        dropoutStackArray.pop();
        System.out.println(dropoutStackArray);

        dropoutStackArray.push(6);
        System.out.println(dropoutStackArray);
        dropoutStackArray.push(7);
        System.out.println(dropoutStackArray);
        dropoutStackArray.push(8);
        System.out.println(dropoutStackArray);
        dropoutStackArray.push(9);
        System.out.println(dropoutStackArray);*/
    }

}
