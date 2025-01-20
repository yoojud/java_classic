package quiz5_8;

public class Cat {
    String name;
    int age;
    // 육식성 동물

    public Cat(String name, int age) {
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
