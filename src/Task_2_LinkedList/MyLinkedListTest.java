package Task_2_LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
//        Friends fr1 = new Friends("Igor", 24, "0989856247");
//        Friends fr2 = new Friends("Ivan", 28, "0976131553");
//        MyLinkedList<Friends> mll = new MyLinkedList<>();
//        mll.add(fr1);
//        mll.add(fr2);
//        mll.size();
//        System.out.println(mll.get(1));
//        System.out.println(mll.get(2));

        MyLinkedList <String> mll = new MyLinkedList<>();
        mll.size();
        mll.add("1");
        System.out.println(mll.get(1));
        mll.size();
        mll.add("2");
        mll.add("3");
        mll.add("4");
//        mll.clear();
//        mll.remove(5);
        mll.size();
        System.out.println(mll.get(3));
        System.out.println(mll);
    }
}
