package SimpleDoubleLinkedList;

import java.util.NoSuchElementException;

public class SimpleDoubleLinkedList implements SimpleList {
    private Node head; // 리스트의 첫 번째 노드
    private Node tail; // 리스트의 마지막 노드
    private int size; // 리스트의 크기

    /**
     * SimpleDoubleLinkedList 생성자
     */
    public SimpleDoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * 리스트가 비어 있는지 확인합니다.
     *
     * @return 리스트가 비어 있으면 true, 그렇지 않으면 false
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 리스트의 끝에 요소를 추가합니다.
     *
     * @param data 추가할 요소의 값
     */
    @Override
    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            // TODO#1 새롭게 추가될 노드가 헤더이면서 테일이된다.
            head = newNode;
            tail = newNode;
        } else {
            // TODO#2 새롭게 추가될 노드를 테일에 붙이고, 새로운 테일이 된다.
            // newNode = 기존 node의 next
            // newNode = 새로운 tail
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    /**
     * 리스트의 앞에 요소를 추가합니다.
     *
     * @param data 추가할 요소의 값
     */
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            // TODO#3 새롭게 추가될 노드가 헤더이면서 테일이된다.
            head = newNode;
            tail = newNode;
        } else {
            // TODO#4 새롭게 추가될 노드를 헤더 앞에 붙이고, 새로운 헤더가 된다.
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    /**
     * 리스트의 첫 번째 요소를 제거하고 반환합니다.
     *
     * @return 제거된 요소의 값
     */
    @Override
    public int remove() {
        if (isEmpty()) {
            throw new RuntimeException("리스트가 비어 있습니다.");
        }

        // TODO#5 리스트의 첫번째 요소를 제거하고, 헤더와 테일이 같은 경우와 그렇지 않은 경우를 분리하여 처리한다.
        int removedData = head.data;
        if (head == tail) {
            head = null;
            tail = null;

        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return removedData;
    }

    /**
     * 리스트의 마지막 요소를 제거하고 반환합니다.
     *
     * @return 제거된 요소의 값
     */
    public int removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("리스트가 비어 있습니다.");
        }
        // TODO#5 리스트의 마지막 요소를 제거하고, 헤더와 테일이 같은 경우와 그렇지 않은 경우를 분리하여 처리한다.
        int removedData = tail.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return removedData;
    }

    /**
     * 리스트에서 지정된 값을 가진 요소를 제거합니다.
     *
     * @param data 제거할 요소의 값
     * @return 제거에 성공하면 true, 그렇지 않으면 false
     */
    @Override
    public boolean remove(int data) {
        if (isEmpty()) {
            return false;
        }
        if (head.data == data) {
            remove();
            return true;
        } else if (tail.data == data) {
            removeLast();
            return true;
        }

        // Node current = head.next;
        // TODO#6 요소 제거시에 헤더와 테일이 같은지 확인 후 처리한다.
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                // size--;
            }
            size--;
            return true;
        }
        current = current.next;
        return false;

    }

    /**
     * 리스트에 특정 요소가 있는지 확인합니다.
     *
     * @param data 찾을 요소의 값
     * @return 요소가 존재하면 true, 그렇지 않으면 false
     */
    @Override
    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * 리스트의 요소 개수를 반환합니다.
     *
     * @return 현재 요소의 개수
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * 리스트의 모든 요소를 문자열로 반환합니다.
     *
     * @return 리스트의 요소를 포함한 문자열
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * SimpleDoubleLinkedList의 요소를 순회하는 Iterator를 반환합니다.
     *
     * @return 요소를 순회하는 SimpleListIterator
     */
    public SimpleListIterator listIterator() {
        return new SimpleDoubleLinkedListIterator();
    }

    // 내부 클래스: SimpleDoubleLinkedList를 위한 Iterator
    private class SimpleDoubleLinkedListIterator implements SimpleListIterator {
        private Node current = null;
        private Node lastReturned = null;

        @Override
        public boolean hasNext() {
            return (((current == null) && (head != null)) ||
                    ((current != null) && (current.next != null)));
        }

        @Override
        public int next() {
            if (!hasNext()) {
                throw new IndexOutOfBoundsException("더 이상 요소가 없습니다.");
            }
            // TODO#10 뒤으로 이동 후 데이터 반환
            // current가 어디를 지시하고 있는지 생각해 보자

            if (current == null) {
                current = head;
            } else {
                current = current.next;
            }
            return current.data;
        }

        @Override
        public boolean hasPrevious() {
            // TODO#8 앞으로 이동할 노드가 있는지 확인
            // lastReturned를 잘 이용하라.
            /* ... */
            return ((current != null) && (current.prev != null));
        }

        @Override
        public int previous() {
            if (!hasPrevious()) {
                // TODO#9 앞으로 이동할 노드가 없다면, IndexOutOfBoundsException
                throw new IndexOutOfBoundsException();
            }

            // TODO#10 앞으로 이동 후 데이터 반환
            /* ... */

            current = current.prev;

            return current.data;
        }

        @Override
        public void remove() {
            // TODO#11 lastReturned가 헤더, 테일, 중간 어딘가에 있을 수 있다.
            // 경우를 고려하여 삭제해 보자.

            if (current == head) {
                head = current.next;
                if (head != null) {
                    head.prev = null;
                } else {
                    tail = null;
                }
            } else if (current == tail) {
                tail = current.prev;
                tail.next = null;
            }
            size--;
        }
    }
}
