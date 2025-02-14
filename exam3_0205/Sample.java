package exam3_0205;

@FunctionalInterface

interface BinaryOp {
    int apply(int i, int j);
}

interface Consumer {
    void accept(String s);
}

class Hello {
    public static int add(int i, int j) {
        return i + j;
    }

    public static void doSomething(String s) {
        System.out.println(s);
    }
}

class Sample {
    public static void main(String[] args) {

        // BinaryOp b = (i, j) -> i + j;

        BinaryOp b = Hello::add;
        Consumer c = Hello::doSomething;
        // Consumer c = s -> System.out.println(s);

        System.out.println(b.apply(1, 2));
        c.accept("Haemil");
    }
}
