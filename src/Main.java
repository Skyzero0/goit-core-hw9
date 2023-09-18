import Task_1_ArrayList.MyArrayList;
import Task_2_LinkedList.MyLinkedList;
import Task_3_Queue.myQueue_Array.MyQueue_Array;
import Task_3_Queue.myQueue_Nodes.MyQueue_Nodes;
import Task_4_Stack.myStack_Array.MyStack_Array;
import Task_4_Stack.myStack_Nodes.MyStack_Nodes;
import Task_5_HashMap.MyHashMap;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        MyArrayList <String> myArrayList = new MyArrayList<>();

        MyLinkedList <String> myLinkedList = new MyLinkedList<>();


        MyQueue_Array <String> myQueueArray = new MyQueue_Array<>();
        MyQueue_Nodes <String> myQueueNodes = new MyQueue_Nodes<>();

        MyStack_Array <String> myStackArray = new MyStack_Array<>();
        MyStack_Nodes <String> myStackNodes = new MyStack_Nodes<>();

        MyHashMap <Integer, String> myHashMap = new MyHashMap<>();
    }
}
