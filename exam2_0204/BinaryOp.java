package exam2_0204;

public interface BinaryOp {
    public int apply(int i, int j);
}

class Adder implements BinaryOp {
    public int apply(int i, int j) {
        return i + j;
    }
}

class Test {
    public static int calc(BinaryOp binder) {
        int i = 5;
        int j = 6;
        return binder.apply(i, j);
    }

    public static void main(String[] args) {
        System.out.println(calc(new Adder()));
        System.out.println(calc(new Multi()));
        System.out.println(calc((x, y) -> x + y));
    }
}
