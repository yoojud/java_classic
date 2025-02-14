package exam1_0205;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Department implements Iterable<Student> {
    private String dname;
    private String no;
    private int officeNo;
    private List<Student> students;

    public Department(String dname, String no, int officeNo) {
        this.dname = dname;
        this.no = no;
        this.officeNo = officeNo;
        this.students = new ArrayList<Student>();
    }

    public String getDname() {
        return this.dname;
    }

    public String getNo() {
        return this.no;
    }

    public int getOfficeNo() {
        return this.officeNo;
    }

    public void add(Student s) {
        this.students.add(s);
    }

    public void sort(Comparator<Student> comparator) {
        Collections.sort(this.students, comparator);
    }

    public void sort() {
        Collections.sort(this.students);
    }

    @Override
    public String toString() {
        return this.no + ", " + this.dname;
    }

    // binary search
    public Student search(int no) {
        this.sort();

        int left = 0;
        int right = this.students.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (this.students.get(mid).getNo() == no) { // mid = no
                return this.students.get(mid);
            } else if (this.students.get(mid).getNo() < no) { // no -> right site
                left = mid + 1;
            } else { // no -> left site
                right = mid - 1;
            }
        }
        return null;
    }

    // 이름으로 검색
    public Student searchByName(String name) {
        this.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));

        int left = 0;
        int right = this.students.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (this.students.get(mid).getName().equals(name)) { // mid = no
                return this.students.get(mid);
            } else if (this.students.get(mid).getName().compareTo(name) < 1) { // name의 크기가 더 큼, right site
                left = mid + 1;
            } else { // no -> left site
                right = mid - 1;
            }
        }
        return null;
    }

    @Override
    public Iterator<Student> iterator() {
        return this.students.iterator();
    }

}
