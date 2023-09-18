package Task_1_ArrayList;

public class MyArrayListTest {
    public MyArrayListTest() {
    }

    public static void main(String[] args) {
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        myArrayList.add("isudh");
        myArrayList.add(9);
        myArrayList.add("765");
        System.out.println(myArrayList);
        myArrayList.size();
        myArrayList.remove(2);
        myArrayList.remove(2);
        myArrayList.get(0);
        myArrayList.size();
        myArrayList.clear();
        myArrayList.size();
        System.out.println(myArrayList);
    }
}
