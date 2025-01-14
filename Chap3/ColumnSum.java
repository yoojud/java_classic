package Chap3;

import java.util.Arrays;
import java.util.Scanner;

public class ColumnSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("2차원 배열의 크기를 입력하세요: ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            System.out.print((i + 1) + "번째 열의 정수를 입력하세요: ");
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();

        // TODO: 각 열의 합을 계산해 출력하세요.
        int sum = 0;
        int idx = 0;
        int[] sums = new int[matrix[0].length]; // 열 합 1차 행렬

        for (int c = 0; c < matrix[0].length; c++) {
            for (int r = 0; r < matrix.length; r++) {
                sum += matrix[r][c];

                sums[idx] = sum;

            }
            System.out.printf("%d열의 합: %d\n", c + 1, sum);
            sum = 0;
            idx++;
        }
        // int[][] matrix = new int[row][column]
        // int[] sums = new int[matrix[0].length]
        System.out.println(Arrays.toString(sums));
    }
}
