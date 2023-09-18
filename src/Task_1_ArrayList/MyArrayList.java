package Task_1_ArrayList;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {
    private final int STARTSIZE = 8;
    private Object[] array = new Object[STARTSIZE];
    private int size = 0;

    public void add(T ob) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = ob;
    }

    public void get(int index) {
        if (index < size && index >= 0) {
            System.out.println(array[index]);
        } else {
            System.out.println("Неправильно введений індекс");
        }
    }

//    public void getAll() {
//        Object[] getArr = new Object[array.length];
//        int i = 0;
//        for (Object o : array) {
//            if (o != null) {
//                getArr[i++] = o;
//            } else {
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(getArr));
//    }

    public void remove(int index) {
        if (index < array.length && index >= 0) {
            for(int i = index; i < array.length; ++i) {
                if (i == array.length - 1) {
                    array[i] = null;
                    --size;
                } else {
                    array[i] = array[i + 1];
                }
            }
        } else {
            System.out.println("Неправильно введений індекс");
        }
    }

    public void clear() {
        array = new Object[STARTSIZE];
        size = 0;
    }

    public int size() {
        System.out.println(size);
        return size;
    }

    public String toString () {
        Object[] arr = new Object[size];
        int y = 0;
        for (Object o:array) {
            if (o!=null){
                arr[y++]=o;
            }
        }
        return Arrays.toString(arr);
    }
}
