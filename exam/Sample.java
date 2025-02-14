package exam;

@FunctionalInterface

interface Predicate {
    boolean test(int i);

}

class Sample {
    public static boolean check(Predicate p, int value) {
        return p.test(value);
    }
}

class Test {
    public static void main(String[] args) {
        // Predicate p = i -> i > 0;
        // Sample.check(p, 2);
        System.out.println("양수입니까?: " + Sample.check(i -> i > 0, 15));
    }
}
