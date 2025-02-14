public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Jae", 3.0);
        Student s2 = new Student(2, "Alice", 3.5);

        System.out.println(s1.compareTo(s2));

        Department department = new Department(1, "Computer Engineering");

        department.add(s1);
        department.add(s2);
        department.add(new Student(4, "Haemil", 4.1));
        department.add(new Student(3, "Danile", 4.2));

        System.out.println();

        for (Student s : department) {
            System.out.println(s);
        }

        // for (int i = 0; i < department.size(); i++) {
        // System.out.println(department.get(i));
        // }

        System.out.println();
        department.sort();
        department.forEach(System.out::println);

        System.out.println();

        department.sort((student1, student2) -> (int) student1.getGrade() - (int) student2.getGrade());
        department.sortByGrade();
        department.forEach(System.out::println);
    }
}