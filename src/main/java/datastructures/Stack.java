package datastructures;

import java.util.EmptyStackException;

public class Stack {
    class Node {
        int value;
        Node nextNode;

        Node(int value) {
            this.value = value;
        }
    }
    Node head;

    public void push(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.nextNode = head;
        head = newNode;
    }

    public int pop() {
        if(head == null) {
            throw new EmptyStackException();
        }
        int value = head.value;
        head = head.nextNode;

        return value;
    }

    public int peek() {
        return head.value;
    }
}
