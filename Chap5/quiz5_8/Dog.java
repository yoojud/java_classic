package quiz5_8;

public class Dog {
    private String name;
    private int age;
    // 잡식성 동물물

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s(%d)", name, age);
    }
}
