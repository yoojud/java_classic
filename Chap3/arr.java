package Chap3;

import java.util.Arrays;
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        int[] number = new int[5];
        int[] num = { 1, 2, 3, 4, 5 };
        int[] numbers = new int[3];
        numbers[0] = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.println(num[i]);
        }

        for (int value : number) {
            System.out.println(value);
        }

        int[][] matrix = new int[2][3];
        int[] mat = { 1, 2, 3 };
        int[][] gg = new int[3][1];
        gg[0] = new int[2];
        gg[1] = new int[4];
        int[] gh = new int[3];

        System.out.println("mat: " + Arrays.toString(mat));

        System.arraycopy(mat, 0, gh, 0, mat.length);
        System.out.println("gh: " + Arrays.toString(gh));

        int[] mat_copy = Arrays.copyOf(mat, mat.length + 2);

        System.out.println("mat_copy: " + Arrays.toString(mat_copy));

        int[] mat_copy1 = Arrays.copyOfRange(mat, 0, 2);

        System.out.println("mat_copy1: " + Arrays.toString(mat_copy1));

    }
}