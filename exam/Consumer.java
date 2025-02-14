package exam;

import java.util.function.Predicate;

public class Consumer {
    public static void main(String[] args) {
        Predicate<Integer> p = n -> n % n == 0;
    }
}