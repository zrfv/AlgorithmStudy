package datastructures;

public class Queue {
    class Node {
        private int value;
        private Node nextNode;
        Node(int value) {
            this.value = value;
        }
    }

    Node head; // get(값 제거)할 때 추가되는 부분
    Node tail; // put(값 추가)할 때 추가되는 부분

    public void put(int value) {
        Node newNode = new Node(value);
        if(tail != null) {
            tail.nextNode = newNode;
        }
        tail = newNode;

        if(head == null) {
            head = tail;
        }
    }

    public int get() {
        int value = head.value; // 값 빼기 전 값 저장
        head = head.nextNode; // 값 빼낸 후 다음 노드 이동

        if(head == null) { // head의 다음 노드가 null 이면 더이상 뺄 값이 없으므로 tail도 null
            tail = null;
        }

        return value;
    }

    public int peek() {
        return head.value;
    }
}
