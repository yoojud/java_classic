
public class Student implements Comparable<Student> {
    private int no;
    private String name;
    private double grade;

    public Student(int no, String name, double grade) {
        this.no = no;
        this.name = name;
        this.grade = grade;
    }

    public int getNo() {
        return this.no;
    }

    public String getName() {
        return this.name;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student s) {
        return this.no - s.getNo();
    }

    @Override
    public String toString() {
        return this.no + ", " + this.name + ", " + this.grade;
    }
}