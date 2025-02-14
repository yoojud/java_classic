import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Department implements Iterable<Student> {
    private int dNo;
    private String dName;
    List<Student> list = new LinkedList<>();

    public Department(int dNo, String dName) {
        this.dNo = dNo;
        this.dName = dName;
    }

    @Override
    public String toString() {
        return this.dNo + ", " + dName;
    }

    public void add(Student s) {
        this.list.add(s);
    }

    public void remove(int index) {
        this.list.remove(index);
    }

    public void sort() {
        Collections.sort(this.list);
    }

    public void sort(Comparator<Student> comparator) {
        Collections.sort(this.list, comparator);
    }

    @Override
    public Iterator<Student> iterator() {
        return this.list.iterator();
    }

}