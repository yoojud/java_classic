package exam;

interface BinaryOp {
    int apply(int i, int j);
}

class Test {
    static int calc(BinaryOp binder, int i, int j) {
        return binder.apply(i, j);
    }
}

class Add implements BinaryOp {
    public int apply(int i, int j) {
        return i + j;
    }

}

public class Lambda {
    public static void main(String[] args) {
        Test.calc(new Add(), 2, 3);
        Test.calc((i, j) -> i + j, 2, 3);
        // int i = Test.calc((x, y) -> x + y, 2, 3);
        // System.out.println(i);
    }
}