package exam;

public interface Predicate {
    public boolean test(int i);
}

class Sample {
    int[] array = { 2, 4, 1, 3, -5, -2, 4, 8, 0, 200 };

    public void filter(Predicate p) {
        for (int a : array) {
            if (p.test(a)) {
                System.out.println(a);
            }
        }

    }
}

class Test {
    public static void main(String[] args) {
        Predicate p1 = i -> i % 2 == 0;
        Sample s = new Sample();
        s.filter(p1);
    }
}
