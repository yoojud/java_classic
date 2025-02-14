package exam1_0205;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Celine", 4.5);
        Student s2 = new Student(11, "Alex", 4.3);
        System.out.println(s1.compareTo(s2));

        Department d = new Department("Computer Engineering", "E01", 101);
        d.add(s1);
        d.add(new Student(2, "Robert", 4.0));
        d.add(new Student(3, "Jason", 4.1));
        d.add(new Student(4, "Jamie", 3.9));
        d.add(new Student(5, "Haeil", 3.5));
        d.add(new Student(6, "Haemil", 3.0));
        d.add(new Student(10, "Steve", 3.2));
        d.add(s2);

        for (Student s : d) {
            System.out.println(s);
        }
        // d.forEach(s -> System.out.println(s));

        Student result = d.search(5);
        System.out.println(result);

        Student searchByName = d.searchByName("Haemil");
        System.out.println(searchByName);

        d.sort();
    }

}