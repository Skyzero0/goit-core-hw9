package Task_4_Stack;

import Task_4_Stack.myStack_Array.MyStack_Array;
import Task_4_Stack.myStack_Nodes.MyStack_Nodes;

public class MyStackTest<E> {
    public static void main(String[] args) {
        MyStack_Nodes <String> msa = new MyStack_Nodes<>();
//        MyStack_Array <String> msa = new MyStack_Array<>();
        msa.push("******1");
//        System.out.println(msa.peek());
//        System.out.println(msa.poll());
//        System.out.println(msa.poll());
//        System.out.println(msa);
        msa.push("------2");
        msa.push("++++++3");
        msa.push("******4");
//        msa.push("------5");
//        msa.push("++++++6");
//        msa.push("******7");
//        System.out.println(msa.peek());
//        msa.push("------8");
//        msa.push("++++++9");
//        msa.push("++++++907421");
//        System.out.println(msa.peek());
//        System.out.println(msa.peek());
//        System.out.println(msa.poll());
//        System.out.println(msa.peek());
//        System.out.println(msa.size());
//        System.out.println(msa.size());
//        msa.remove(2);
//        msa.remove(2);
//        msa.remove(1);
//        msa.remove(3);
        msa.remove(1);
        msa.remove(1);
        msa.remove(1);
        msa.remove(5);
//        System.out.println(msa);
//        System.out.println(msa.size());
//        System.out.println(msa.peek());
//        System.out.println(msa.poll());
//        System.out.println(msa.poll());
//        System.out.println(msa.poll());
        System.out.println(msa.poll());
        System.out.println(msa);


//        MyStack_Array <String> ms = new MyStack_Array<>();
//        ms.push("******1");
//        System.out.println(ms.peek());
//        System.out.println(ms.poll());
//        System.out.println(ms.poll());
//        ms.push("------2");
//        ms.push("++++++3");
//        ms.push("******4");
//        ms.push("------5");
//        ms.push("++++++6");
//        ms.push("******7");
//        System.out.println(ms);
//        ms.clear();
//        System.out.println(ms);

    }
}
