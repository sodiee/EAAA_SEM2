package Opg1;

public class ArrayStack implements IStack {
    Object[] arr;

    int numberOfElements;

    public ArrayStack() {
        arr = new Object[2];
        numberOfElements = 0;
    }

    @Override
    public void push(Object element) {
        checkSpace();
        arr[numberOfElements] = element;
        numberOfElements++;
    }

    @Override
    public Object pop() {
        Object deleted = arr[numberOfElements - 1];
        arr[numberOfElements - 1] = null;
        numberOfElements--;

        return deleted;
    }

    @Override
    public Object peek() {
        return arr[numberOfElements - 1];
    }

    @Override
    public boolean isEmpty() {
        return arr[0] == null;
    }

    @Override
    public int size() {
        return numberOfElements;
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

    public void checkSpace() {
        if (numberOfElements == arr.length) {
            Object[] newArr = new Object[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
    }
}
