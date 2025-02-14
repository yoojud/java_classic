package exam_0212;
interface Comparable<T> {

    public int compareTo(T item);
}

class Student implements Comparable<Student> {
    int studentNo;

    @Override
    public int compareTo(Student item) {
        return this.studentNo - item.studentNo;
    }
}

class Box {
    public static <T> void printArray(T[] array) {
        for (T i : array) {
            System.out.println(i);
        }
    }
    // T value;

    // public Box(T value) {
    // this.value = value;
    // }

    // public void setValue(T value) {
    // this.value = value;
    // }

    // public T getValue() {
    // return this.value;
    // }
}

public class Boxexam {
    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4, 5 };
        Box.printArray(array);

        // Box<Integer> box1 = new Box<Integer>(1);
        // Box<String> box2 = new Box<String>("Haemil");
        // System.out.println(box1.getValue());
        // System.out.println(box2.getValue());
    }
}
