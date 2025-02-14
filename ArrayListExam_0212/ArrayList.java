// package ArrayListExam_0212;

import java.util.Iterator;

public class ArrayList<E extends Comparable<E>> implements Iterable<E> {
    private E[] elements;
    private int index = 0;

    public ArrayList() {
        this.elements = (E[]) new Object[10];
    }

    public void add(E item) {
        try {
            this.elements[this.index++] = item;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("List full!");
        }
    }

    public void remove(int index) {
        for (int i = index; i < this.index - 1; i++) {
            this.elements[i] = this.elements[i + 1];
            this.elements[i + 1] = null;
        }
        this.index--;
    }

    public E get(int index) {
        return this.elements[index--];
    }

    public int size() {
        return this.index;
    }

    public Iterator<E> iterator() {
        return new ArrayListEnumerator<E>(this);
    }
}