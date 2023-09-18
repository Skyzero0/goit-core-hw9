package Task_4_Stack.myStack_Array;

import java.util.Arrays;
import java.util.Objects;

public class MyStack_Array <E> {
    private final int STARTSIZE = 9;
    private Object[] array = new Object[STARTSIZE];
    private int size = 0;

    public void push(E item) {
        Object [] newArray = new Object[array.length+array.length/2];
        if (size==array.length) {
            newArray = Arrays.copyOf(array, newArray.length);
            array = newArray;
        }
        array[size++] = item;
    }

    public void remove(int index) {
        if (array[0] == null) {
            System.out.println("Stack is empty");
        }
        if (index - 1 >= 0 && index - 1 < array.length) { //перевірка на коректність індекса
            for(int i = index - 1; i < array.length; i++) {
                if (i == array.length - 1) {
                    array[i] = null;
                    size--;
                    break;
                }
                array[i] = array[i + 1];
            }
        } else {
            System.out.println("Incorrect index");
        }
    }

    public void clear() {
        array = new Object[STARTSIZE];
    }

    public int size() {
        int s = 0;
        for (Object o : this.array) {
            if (o != null) {
                ++s;
            }
        }
        return s;
    }

    public Object peek() {
        Object some = null;
        if (array[0] == null) {
            System.out.println("Stack is empty");
            return null;
        } else {
            for(int i = 0; i < array.length && array[i] != null; i++) {
                some = array[i];
            }
            return some;
        }
    }

    public Object poll() {
        Object some = null;
        if (array[0] == null) {
            System.out.println("Stack is empty");
        } else {
            int i;
            for(i = 0; i < array.length && array[i] != null; i++) {
                some = array[i];
            }
            array[i-1] = null;
            size--;
        }
        return some;
    }

    public String toString() {
        Object [] arr = new Object[size()];
        for (int i = 0; i < array.length&&array[i]!=null; i++) {
            arr[i] = array[i];
        }
        return Arrays.toString(arr);
    }
}
