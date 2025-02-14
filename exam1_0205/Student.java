package exam1_0205;

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

    @Override
    public int compareTo(Student s) {
        return this.no - s.getNo();

        // if (this.no > s.getNo()) {
        // return 1;
        // }
        // else if (this.no == s.getNo()) {
        // return 0;
        // }
        // else
        // return -1;
    }

    @Override
    public String toString() {
        return this.no + ", " + this.name + ", " + this.grade;
    }

}
