package Chap3;

import java.util.Scanner;

public class RowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("2차원 배열의 크기를 입력하세요: ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            System.out.print((i + 1) + "번째 행의 정수를 입력하세요: ");
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // TODO: 각 행의 합을 구해서 출력하세요.

        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum += matrix[i][j];
            }
            System.out.printf("%d행의 합: %d\n", i + 1, sum);
            sum = 0;
        }
    }
}
