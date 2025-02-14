import java.util.Iterator;

public class Student implements Comparable<Student> {

    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return this.no;
    }

    public String getName() {
        return this.name;
    }

    // @Override
    public Iterator<Student> iterator() {
        return this.iterator();
    }

    @Override
    public int compareTo(Student s) {
        return this.no - s.getNo();
    }

    @Override
    public String toString() {
        return this.no + ", " + this.name;
    }

}