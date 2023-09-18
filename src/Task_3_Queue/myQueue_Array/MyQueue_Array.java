//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Task_3_Queue.myQueue_Array;

import java.util.Arrays;

public class MyQueue_Array<T> {
    private final int STARTSIZE = 10;
    private Object[] array = new Object[STARTSIZE];
    private int size = 0;

    public void add(T item) {
        Object[] newArray = new Object[array.length + array.length/2];
        if (size == array.length) {
            newArray = Arrays.copyOf(array, newArray.length);
            array = newArray;
        }
        array[size++] = item;
    }

    public void clear() {
        array = new Object[STARTSIZE];
        size = 0;
    }

    public int size() {
        int i = 0;
        Object[] arr = array;
        for (Object o : arr) {
            if (o != null) {
                ++i;
            }
        }
        System.out.println("Size:" + i);
        return i;
    }

    public Object peek() {
        if (array[0]==null){
            System.out.println("Stack is empty");
        } else {
            return array[0];
        }
        return null;
    }

    public Object poll() {
        Object o = array[0];
        if (array[0]==null){
            System.out.println("Queue is empty");
            return null;
        } else {
            array= Arrays.copyOfRange(array,1,array.length+1);
            size--;
            return o;
        }
    }

    public String toString() {
        Object[]arr = new Object[size];
        int i = 0;
        for (Object o:array) {
            if (o!=null){
                arr[i++] = o;
            }
        }
        return Arrays.toString(arr);
    }
}
