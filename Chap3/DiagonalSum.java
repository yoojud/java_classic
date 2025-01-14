package Chap3;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("2차원 배열의 크기를 입력하세요: ");
        int rowColumn = sc.nextInt();

        int[][] matrix = new int[rowColumn][rowColumn];

        for (int i = 0; i < rowColumn; i++) {
            System.out.print((i + 1) + "번째 행의 정수를 입력하세요: ");
            for (int j = 0; j < rowColumn; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();

        // TODO: 두 대각선의 합을 계산해 출력하세요.
        int diagonalSum1 = 0;
        int diagonalSum2 = 0;

        // for (int i = 0; i < matrix[0].length; i++) {
        // for (int j = i; j <= i; j++) {
        // sum += matrix[i][j];
        // }
        // }
        // System.out.println("주 대각선의 합: " + sum);

        for (int i = 0; i < rowColumn; i++) {
            diagonalSum1 += matrix[i][i];
            diagonalSum2 += matrix[i][rowColumn - 1 - i];
        }

        System.out.println("주 대각선의 합: " + diagonalSum1);
        System.out.println("주 대각선의 합: " + diagonalSum2);

    }
}
