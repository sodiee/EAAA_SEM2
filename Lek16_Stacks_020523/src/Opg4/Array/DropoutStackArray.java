package Opg4.Array;

import Opg1.IStack;

public class DropoutStackArray implements IStack {

    Object[] arr;

    int top;

    public DropoutStackArray() {
        arr = new Object[5];
        top = 0;
    }

    @Override
    public void push(Object element) {
        resetNumbersOfElementVarPush();
        arr[top] = element;
        top++;
    }

    @Override
    public Object pop() {
        resetNumbersOfElementVarPop();
        Object deleted = arr[top - 1];
        arr[top - 1] = null;
        top--;

        return deleted;
    }

    @Override
    public Object peek() {
        return arr[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return arr[0] == null;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                sb.append(arr[i]).append(", ");
            }
        }
        return "ArrayStack : " + sb.toString();
    }

    public void resetNumbersOfElementVarPush() {
        if (top == 5) {
            top = 0;
        }
    }

    public void resetNumbersOfElementVarPop() {
        if (top == 0) {
            top = 5;
        }
    }

    public int getTop() {
        return top;
    }
}
