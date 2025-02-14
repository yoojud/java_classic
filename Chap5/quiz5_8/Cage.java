package quiz5_8;

import java.util.NoSuchElementException;

public class Cage {

    public static final int MAX_DOG = 3;
    public static final int MAX_CAT = 2;

    Dog[] dogs;
    int dogCount;
    Cat[] cats;
    int catCount;

    public Cage() {
        dogs = new Dog[MAX_DOG];
        cats = new Cat[MAX_CAT];

    }

    public void put(Dog dog) {
        if (dogCount < MAX_DOG) {
            dogs[dogCount++] = dog;
        } else {
            throw new IllegalArgumentException("강아지 자리가 없습니다.");
        }

    }

    public void put(Cat cat) {
        if (catCount < MAX_CAT) {
            cats[catCount++] = cat;
        } else {
            throw new IllegalArgumentException("고양이 자리가 없습니다.");
        }
    }

    public Dog pullDog(String name) {
        for (int i = 0; i < dogCount; i++) {
            if (dogs[i].getName().equals(name)) {
                Dog dog = dogs[i];

                System.arraycopy(dogs, i + 1, dogs, i, dogCount - i - 1);
                dogCount--;

                return dog;
            }
            // abc -> b) ac
        }

        throw new NoSuchElementException();
    }

    public Cat pullCat(String name) {
        for (int i = 0; i < catCount; i++) {
            if (cats[i].getName().equals(name)) {
                Cat cat = cats[i];

                System.arraycopy(cats, i + 1, cats, i, catCount - i - 1);
                catCount--;

                return cat;
            }
        }

        throw new NoSuchElementException();
    }

    public String[] getType() {
        if (dogCount != 0 && catCount != 0) {
            return new String[] { "dog", "cat" };
        } else if (dogCount == 0 && catCount != 0) {
            return new String[] { "cat" };
        } else if (dogCount != 0 && catCount == 0) {
            return new String[] { "dog" };
        } else {
            return new String[0];
        }

    }

    public String[] getCountOf(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new String[] { "dog", String.valueOf(dogCount) };
        } else if (type.equalsIgnoreCase("cat")) {
            return new String[] { "cat", String.valueOf(catCount) };
        } else {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
