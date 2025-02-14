package exam_0210;
import java.util.Arrays;

public class Lab1_2 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        boolean[] b = new boolean[a.length];
        double[] c = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = (a[i] % 2 == 1);
        }

        for (int i = 0; i < a.length; i++) {
            // c[i] = Math.PI * Math.pow(a[i], 2);
            c[i] = Math.PI * a[i] * a[i];
        }

        System.out.println("배열 a: " + Arrays.toString(a));
        System.out.println("배열 b (홀수 여부): " + Arrays.toString(b));
        System.out.println("배열 c (원의 면적): " + Arrays.toString(c));
    }
}