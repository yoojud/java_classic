package exam_0210;
import java.util.Arrays;

public class Lab1_1 {

    public static void main(String[] args) {

        float[] x = new float[10];
        args = new String[10];
        boolean[] isPrime = new boolean[5];
        int[] fib1 = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };
        int[] fib2 = new int[] { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };
        double[][] a = { { 1.1, 2.2 }, { 3.3, 4.4 }, null, { 5.5, 6.6 }, null };
        short[][] b = new short[4][10];
        Object[] objects = new Object[] { x, args, isPrime, fib1, b, a };
        Integer[] ints = new Integer[0];

        System.out.println("x :" + Arrays.toString(x));
        System.out.println("args :" + Arrays.toString(args));
        System.out.println("isPrime :" + Arrays.toString(isPrime));
        System.out.println("fib1: " + Arrays.toString(fib1));
        System.out.println("fib2: " + Arrays.toString(fib2));
        System.out.println("double: " + Arrays.toString(a));
        System.out.println("short: " + Arrays.toString(b));
        System.out.println("objects: " + Arrays.toString(objects));
        System.out.println("Integer: " + Arrays.toString(ints));
        System.out.println("object instanceof Object[]: " + (objects instanceof Object[]));
        System.out.println("objects[0] instanceof Object: " + (objects[0] instanceof Object));
        System.out.println("objects[0] instanceof float[]: " + (objects[0] instanceof float[]));
        System.out.println("b[0] instanceof short[]: " + (b[0] instanceof short[]));
        System.out.println("ints instanceof Object: " + (ints instanceof Object));
        System.out.println("ints instanceof Object[]: " + (ints instanceof Object[]));
    }

}
