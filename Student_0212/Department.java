import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Department implements Iterable<Student> {
    private int no;
    private String name;
    private List<Student> list = new LinkedList<>();

    public Department(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return this.no;
    }

    public String getName() {
        return this.name;
    }

    public Student get(int index) {
        return list.get(index);
    }

    public int size() {
        return this.list.size();
    }

    public void add(Student s) {
        list.add(s);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public void sort() {
        Collections.sort(this.list);
    }

    public void sort(Comparator<Student> comparable) {
        Collections.sort(this.list, comparable);
    }

    public void sortByGrade() {
        Comparator<Student> comparator = (s1, s2) -> (int) s2.getGrade() - (int) s1.getGrade();
        Collections.sort(this.list, comparator);
    }

    @Override
    public String toString() {
        return this.no + ", " + this.name;
    }

    @Override
    public Iterator<Student> iterator() {
        return list.iterator();
    }

}