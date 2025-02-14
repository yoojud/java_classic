package quiz5_8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cage cage = new Cage();

        cage.put(new Dog("dog1", 10));
        cage.put(new Dog("dog2", 1));
        cage.put(new Dog("cat1", 1));
        // cage.put(new Dog("cat2", 3));

        System.out.println("동물의 종류: " + Arrays.toString(cage.getType()));
        Dog dog = cage.pullDog("dog1");

        System.out.println("개를 꺼냈습니다: " + dog);
    }
}