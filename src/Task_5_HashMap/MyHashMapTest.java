package Task_5_HashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<Integer, String> mhm = new MyHashMap<>();
//        mhm.put(2, "two");
//        mhm.put(5, "five");
//        mhm.put(2, "два");
//        mhm.put(5, "55five");
//        mhm.put(5, "55five00");
//        mhm.put(6, "6666");
//        mhm.put(6, null);
//        mhm.remove(5);
        System.out.println(mhm.size());
        System.out.println(mhm);
        System.out.println(mhm.get(8));
    }
}
