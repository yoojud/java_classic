// package ArrayListExam_0212;

import java.util.Iterator;

public class ArrayListEnumerator<E extends Comparable<E>> implements Iterator<E> {
    ArrayList<E> list;
    int index = 0;

    public ArrayListEnumerator(ArrayList<E> list) {
        this.list = list;
    }

    public boolean hasNext() {
        if (list.size() <= this.index) {
            return false;
        } else {
            return true;
        }
    }

    public E next() {
        return list.get(this.index++);
    }
}