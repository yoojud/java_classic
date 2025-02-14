package exam;

@FunctionalInterface

public interface Function {
    public int apply(int i, int j);
}

class Sample {
    public static int calc(Function f, int i, int j) {
        return f.apply(i, j);
    }
}

class Test {
    public static void main(String[] args) {
        Function f = (i, j) -> i + j;
        System.out.println(Sample.calc(f, 2, 3));
    }
}
