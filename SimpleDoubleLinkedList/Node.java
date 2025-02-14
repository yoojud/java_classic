package SimpleDoubleLinkedList;

public class Node {
    int data;
    Node prev; // 이전 노드를 가리키는 참조
    Node next; // 다음 노드를 가리키는 참조

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    // Node(int data, Node prev, Node next) {
    // this.prev = prev;
    // this.next = next;
    // this.data = data;
    // }
}
