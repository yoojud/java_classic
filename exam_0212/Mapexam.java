package exam_0212;
interface Function<T, R> {
    R apply(T t);
}

interface Predicate<T> {
    boolean test(T t);
}

interface Supplier<T> {
    T get();
}

interface Consumer<T> {
    void accept(T t);
}

// class Map<K, V> {
// K key;
// V value;

// int[] keys = { 1, 2, 3 };
// String[] elements = { "Celine", "James", "Robert" };

// public String get(int key) {
// return elements[--key];
// }
// }

class Mapexam {
    public static void main(String[] args) {
        // Map<Integer, String> m = new Map<>();
        // System.out.println(m.get(1));

        Function<Integer, String> f = x -> "value is: " + x;
        System.out.println(f.apply(1));

        Predicate<Integer> p = x -> x > 0;
        System.out.println("양수입니까?: " + p.test(1));

        Supplier s = () -> "Hello, world!";
        System.out.println(s.get());

        Consumer<String> c = x -> System.out.println(x);
        c.accept("Hi");
    }
}
