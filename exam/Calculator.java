package exam;

@FunctionalInterface

interface Calculator {
    int calculate(int x, int y);
}

class Sample {
    int i;
    int j;

    public int doSomething(Calculator c) {
        return c.calculate(this.i, this.j);
    }
}

class Test {
    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println(s.doSomething((x, y) -> x + y));
        // Calculator c = (x, y) -> x + y;
        // System.out.println(c.calculate(1, 2));
    }
}
