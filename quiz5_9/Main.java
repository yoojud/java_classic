package quiz5_9;

public class Main {
    public static void main(String[] args) {

        // Animal[] animals = new Animal[9];
        // 크기 지정 없이 배열 만들기
        Animal[] animals = new Animal[] {
                new Bat(), new Cat(), new Dog(), new Dugong(), new Eagle(), new Ostrich(), new Penguin(), new Turtle(),
                new Whale()
        };

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

}
