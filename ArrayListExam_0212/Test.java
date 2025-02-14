import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        // ArrayList<Student> list = new ArrayList<>();
        Department list = new Department(1, "Computer Science");

        list.add(new Student(1, "Haemil", 3.0));
        list.add(new Student(3, "Haeil", 2.0));
        list.add(new Student(4, "Michell", 4.0));
        list.add(new Student(2, "Jae", 2.5));
        list.add(new Student(7, "K", 2.0));

        // Student print
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        // Department print
        System.out.println("Department Info");
        System.out.println(list);
        System.out.println();

        // list.sort();

        // name sort
        list.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));

        System.out.println("Student Info");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}