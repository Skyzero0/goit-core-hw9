package Task_3_Queue;

import Task_3_Queue.myQueue_Array.MyQueue_Array;
import Task_3_Queue.myQueue_Nodes.MyQueue_Nodes;

public class MyQueueTest {
    public static void main(String[] args) {
//        MyQueue_Array<Object> myQueue = new MyQueue_Array<>();
//        myQueue.add("qwe");
//        myQueue.add("qwerty");
//        myQueue.add("123");
//        myQueue.add("qwe");
//        myQueue.size();
//        System.out.println(myQueue);
//        myQueue.clear();
//        myQueue.add("ff");
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());
//        myQueue.size();
//        System.out.println(myQueue);


        MyQueue_Nodes <String> msn = new MyQueue_Nodes<>();
        msn.add("2i");
        msn.add("1q");
        System.out.println(msn.peek());
        msn.clear();
//        System.out.println(msn.poll());
//        System.out.println(msn.size());
//        System.out.println(msn.poll());
//        System.out.println(msn.poll());
        System.out.println(msn);
    }
}
